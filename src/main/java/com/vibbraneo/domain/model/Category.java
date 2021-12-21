package com.vibbraneo.domain.model;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tbl_categoria")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String description;

    @ToString.Exclude
    @OneToOne
    private Despesa despesa;
}
