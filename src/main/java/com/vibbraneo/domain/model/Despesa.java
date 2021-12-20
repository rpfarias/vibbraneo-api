package com.vibbraneo.domain.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tbl_despesa")
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private String description;
    private LocalDateTime accrual_date;
    private LocalDateTime transaction_date;
    private Integer customer_id;

    @ToString.Exclude
    @OneToOne(mappedBy = "despesa", fetch = FetchType.LAZY)
    private Categoria categoria;

    @ToString.Exclude
    @OneToOne(mappedBy = "despesa", fetch = FetchType.LAZY)
    private Empresa empresa;

    @ToString.Exclude
    @ManyToOne
    private User user;
}
