package com.gabs.assertj.assertjchapter.application.controllers.converters;


import com.gabs.assertj.assertjchapter.application.controllers.requests.ProdutoRequestModel;
import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoProdutoRequest;
import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoShopping;
import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoShoppingResponse;
import org.springframework.stereotype.Component;

@Component
public class CarrinhoShoppingConverter {
    public CarrinhoProdutoRequest toProdutoRequest(ProdutoRequestModel produtoRequestModel) {

        return null;

    }

    public CarrinhoShoppingResponse toCarrinhoShoppingResponse(CarrinhoShopping carrinhoShopping) {

        return null;
    }
}
