package com.gabs.assertj.assertjchapter.domain.carrinho;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "carrinho_shopping")
public class CarrinhoShopping implements Serializable {


    public CarrinhoShopping adicionarProduto(CarrinhoProdutoRequest carrinhoProdutoRequest) {

        return null;
    }
}
