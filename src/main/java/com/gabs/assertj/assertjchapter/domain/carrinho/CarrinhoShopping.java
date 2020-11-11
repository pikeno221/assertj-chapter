package com.gabs.assertj.assertjchapter.domain.carrinho;


import com.gabs.assertj.assertjchapter.domain.cliente.Cliente;
import com.gabs.assertj.assertjchapter.domain.produto.Produto;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "carrinho_shopping")
public class CarrinhoShopping implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    @OneToMany
    private List<Produto> produtos;


    private LocalDate dataAtualizacao;


    @PreUpdate
    public void beforeUpdate() {
        this.dataAtualizacao = LocalDate.now();

    }


    public CarrinhoShopping adicionarProduto(CarrinhoProdutoRequest carrinhoProdutoRequest) {

        return null;
    }
}
