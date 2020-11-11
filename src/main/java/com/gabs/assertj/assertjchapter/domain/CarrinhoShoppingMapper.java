package com.gabs.assertj.assertjchapter.domain;

import com.gabs.assertj.assertjchapter.application.controllers.requests.CarrinhoProdutoRequestModel;
import com.gabs.assertj.assertjchapter.application.controllers.responses.CarrinhoShoppingResponseModel;
import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoProdutoRequest;
import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoShopping;
import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoShoppingResponse;
import org.mapstruct.Mapper;

@Mapper
public interface CarrinhoShoppingMapper {

    CarrinhoProdutoRequest fromCarrinhoProdutoRequestModelToCarrinhoProdutoRequest(CarrinhoProdutoRequestModel carrinhoProdutoRequestModel);

    CarrinhoShoppingResponse fromCarrinhoShoppingToCarrinhoShoppingResponse(CarrinhoShopping carrinhoShopping);

    CarrinhoShoppingResponseModel fromCarrinhoShoppingToCarrinhoShoppingResponseModel(CarrinhoShoppingResponse carrinhoShoppingResponse);




}
