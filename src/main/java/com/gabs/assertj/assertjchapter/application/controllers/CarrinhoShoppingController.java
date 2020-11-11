package com.gabs.assertj.assertjchapter.application.controllers;


import com.gabs.assertj.assertjchapter.application.controllers.converters.CarrinhoShoppingConverter;
import com.gabs.assertj.assertjchapter.application.controllers.requests.ProdutoRequestModel;
import com.gabs.assertj.assertjchapter.application.controllers.responses.CarrinhoShoppingResponseModel;
import com.gabs.assertj.assertjchapter.services.CarrinhoShoppingService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController(value = "/shoppings/carrinhos")
@AllArgsConstructor
public class CarrinhoShoppingController {

    private final CarrinhoShoppingService service;

    private final CarrinhoShoppingConverter converter;



    @PostMapping(value = "/produtos")
    public ResponseEntity<CarrinhoShoppingResponseModel> adicionarProduto(@Valid @RequestBody ProdutoRequestModel produtoRequestModel, @PathVariable Long idCarrinho) {

        CarrinhoShoppingResponseModel carrinhoShoppingResponseModel = service.adicionarProduto(converter.toProdutoRequest(produtoRequestModel), idCarrinho);

        return ResponseEntity.created(null).body(carrinhoShoppingResponseModel);

    }

}
