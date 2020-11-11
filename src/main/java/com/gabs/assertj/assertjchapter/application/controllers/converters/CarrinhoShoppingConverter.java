package com.gabs.assertj.assertjchapter.application.controllers.converters;


import com.gabs.assertj.assertjchapter.application.controllers.requests.CarrinhoProdutoRequestModel;
import com.gabs.assertj.assertjchapter.application.controllers.responses.CarrinhoShoppingResponseModel;
import com.gabs.assertj.assertjchapter.domain.CarrinhoShoppingMapper;
import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoProdutoRequest;
import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoShopping;
import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoShoppingResponse;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
public class CarrinhoShoppingConverter {


    private CarrinhoShoppingMapper mapper = Mappers.getMapper(CarrinhoShoppingMapper.class);


    public CarrinhoProdutoRequest toProdutoRequest(CarrinhoProdutoRequestModel carrinhoProdutoRequestModel, Long idCarrinho) {

        CarrinhoProdutoRequest carrinhoProdutoRequest = mapper.fromCarrinhoProdutoRequestModelToCarrinhoProdutoRequest(carrinhoProdutoRequestModel);

        carrinhoProdutoRequest.setIdCarrinho(idCarrinho);

        return carrinhoProdutoRequest;

    }

    public CarrinhoShoppingResponse toCarrinhoShoppingResponse(CarrinhoShopping carrinhoShopping) {

        return mapper.fromCarrinhoShoppingToCarrinhoShoppingResponse(carrinhoShopping);

    }

    public CarrinhoShoppingResponseModel toCarrinhoShoppingResponseModel(CarrinhoShoppingResponse carrinhoShoppingResponse) {

        return mapper.fromCarrinhoShoppingToCarrinhoShoppingResponseModel(carrinhoShoppingResponse);

    }
}
