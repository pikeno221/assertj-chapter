package com.gabs.assertj.assertjchapter.domain.produto;

import javax.persistence.*;

@Entity
@Table(name = "carrinho_shopping")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double valor;

}
