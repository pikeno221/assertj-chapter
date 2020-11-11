package com.gabs.assertj.assertjchapter.application.controllers.responses;

import com.gabs.assertj.assertjchapter.domain.produto.Produto;

import java.io.Serializable;
import java.util.List;

public class CarrinhoShoppingResponseModel implements Serializable {

    private List<ProdutoResponseModel> produtos;

    private Double valor;


}
