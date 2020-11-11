package com.gabs.assertj.assertjchapter.services;

import com.gabs.assertj.assertjchapter.application.controllers.converters.CarrinhoShoppingConverter;
import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoProdutoRequest;
import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoShopping;
import com.gabs.assertj.assertjchapter.application.controllers.responses.CarrinhoShoppingResponseModel;
import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoShoppingResponse;
import com.gabs.assertj.assertjchapter.infrastructure.repositories.CarrinhoShoppingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CarrinhoShoppingService {

    private final CarrinhoShoppingConverter converter;

    private final CarrinhoShoppingRepository repository;


    public CarrinhoShoppingResponse adicionarProduto(CarrinhoProdutoRequest carrinhoProdutoRequest, Long idCarrinho) {
        // cache
        // noSQL db

        try {

            Optional<CarrinhoShopping> carrinhoShoppingOptional = repository.findById(idCarrinho);

            if (carrinhoShoppingOptional.isPresent()) {

                CarrinhoShopping carrinhoShopping = carrinhoShoppingOptional.get().adicionarProduto(carrinhoProdutoRequest);

                carrinhoShopping = repository.save(carrinhoShopping);


                return converter.toCarrinhoShoppingResponse(carrinhoShopping);

            }

            return null;


        } catch (Exception exception) {
            throw new RuntimeException("Error");


        }
    }

}
