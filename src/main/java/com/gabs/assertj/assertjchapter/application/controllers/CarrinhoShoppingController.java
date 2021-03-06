package com.gabs.assertj.assertjchapter.application.controllers;


import com.gabs.assertj.assertjchapter.application.controllers.converters.CarrinhoShoppingConverter;
import com.gabs.assertj.assertjchapter.application.controllers.requests.CarrinhoProdutoRequestModel;
import com.gabs.assertj.assertjchapter.application.controllers.responses.CarrinhoShoppingResponseModel;
import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoProdutoRequest;
import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoShoppingResponse;
import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoShoppingService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.util.ObjectUtils.isEmpty;

@RestController
@RequestMapping("/shoppings/carrinhos")
@AllArgsConstructor
public class CarrinhoShoppingController {

    private final CarrinhoShoppingService service;

    private final CarrinhoShoppingConverter converter;


    @PostMapping("{idCarrinho}/produtos")
    public ResponseEntity<CarrinhoShoppingResponseModel> adicionarProduto(@Valid @RequestBody CarrinhoProdutoRequestModel carrinhoProdutoRequestModel, @PathVariable Long idCarrinho) {

        CarrinhoProdutoRequest carrinhoProdutoRequest = converter.toProdutoRequest(carrinhoProdutoRequestModel, idCarrinho);

        CarrinhoShoppingResponse carrinhoShoppingResponse = service.adicionarProduto(carrinhoProdutoRequest);

        CarrinhoShoppingResponseModel carrinhoShoppingResponseModel = converter.toCarrinhoShoppingResponseModel(carrinhoShoppingResponse);


        return isEmpty(carrinhoShoppingResponse) ? ResponseEntity.notFound().build() :
                ResponseEntity.created(null).body(carrinhoShoppingResponseModel);

    }

}
