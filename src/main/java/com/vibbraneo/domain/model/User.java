package com.vibbraneo.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tbl_usuario")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true, nullable = false)
    private String mail;

    @JsonIgnore
    private String password;

    private String cnpj;
    private String company_name;
    private String phone_number;

    @ToString.Exclude
    @OneToMany
    private List<Despesa> despesas;

    @ToString.Exclude
    @OneToMany
    private List<Revenue> revenues;

    @ToString.Exclude
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "tbl_user_role_rel",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;
}
