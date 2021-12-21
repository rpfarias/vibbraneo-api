package com.vibbraneo.domain.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tbl_receita")
public class Revenue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private String invoice_id;
    private String description;
    private Date accrual_date;
    private LocalDateTime transaction_date;

    @ToString.Exclude
    @OneToOne
    private Empresa empresa;

    @ToString.Exclude
    @ManyToOne
    private User user;

}
