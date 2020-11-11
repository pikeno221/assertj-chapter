package com.gabs.assertj.assertjchapter.domain;

import com.gabs.assertj.assertjchapter.application.controllers.requests.CarrinhoProdutoRequestModel;
import com.gabs.assertj.assertjchapter.application.controllers.responses.CarrinhoShoppingResponseModel;
import com.gabs.assertj.assertjchapter.application.controllers.responses.ProdutoResponseModel;
import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoProdutoRequest;
import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoShopping;
import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoShoppingResponse;
import com.gabs.assertj.assertjchapter.domain.produto.Produto;
import com.gabs.assertj.assertjchapter.domain.produto.ProdutoResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CarrinhoShoppingMapper {


    CarrinhoProdutoRequest fromCarrinhoProdutoRequestModelToCarrinhoProdutoRequest(CarrinhoProdutoRequestModel carrinhoProdutoRequestModel);


    CarrinhoShoppingResponseModel fromCarrinhoShoppingToCarrinhoShoppingResponseModel(CarrinhoShoppingResponse carrinhoShoppingResponse);

    Produto fromCarrinhoProdutoRequestToProduto(CarrinhoProdutoRequest carrinhoProdutoRequest);

    ProdutoResponseModel fromProdutoResponseToProdutoResponseModel(ProdutoResponse produtoResponse);

    ProdutoResponse fromProdutoResponseModelToProdutoResponse(ProdutoResponseModel produtoResponseModel);

    ProdutoResponse fromProdutoToProdutoResponse(Produto produto);

    List<ProdutoResponse> fromProdutosToProdutosResponse(List<Produto> produtos);





}
