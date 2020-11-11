package com.gabs.assertj.assertjchapter.domain.carrinho;


import com.gabs.assertj.assertjchapter.domain.cliente.Cliente;
import com.gabs.assertj.assertjchapter.domain.produto.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "carrinho_shopping")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarrinhoShopping implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> produtos;


    private static LocalDate dataAtualizacao;


    @PreUpdate
    public void beforeUpdate() {
        this.dataAtualizacao = LocalDate.now();

    }


    public CarrinhoShopping adicionarProduto(Produto produto) {

        this.produtos.add(produto);
        return this;

    }

}
