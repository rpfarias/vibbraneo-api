package com.vibbraneo.domain.model;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tbl_empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cnpj;
    private String commercial_name;
    private String legal_name;

    @ToString.Exclude
    @OneToOne(mappedBy = "empresa", fetch = FetchType.LAZY)
    private Receita receita;

    @ToString.Exclude
    @OneToOne(mappedBy = "empresa", fetch = FetchType.LAZY)
    private Despesa despesa;

}
