package com.gabs.assertj.assertjchapter.domain.carrinho;

import com.gabs.assertj.assertjchapter.application.controllers.converters.CarrinhoShoppingConverter;
import com.gabs.assertj.assertjchapter.domain.CarrinhoShoppingMapper;
import com.gabs.assertj.assertjchapter.domain.produto.Produto;
import com.gabs.assertj.assertjchapter.infrastructure.repositories.CarrinhoShoppingRepository;
import com.gabs.assertj.assertjchapter.infrastructure.repositories.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CarrinhoShoppingService {

    private final CarrinhoShoppingConverter converter;

    private final CarrinhoShoppingRepository repository;

    private final ProdutoRepository produtoRepository;

    private final CarrinhoShoppingMapper mapper = Mappers.getMapper(CarrinhoShoppingMapper.class);


    public CarrinhoShoppingResponse adicionarProduto(CarrinhoProdutoRequest carrinhoProdutoRequest) {

        try {

            Optional<CarrinhoShopping> carrinhoShoppingOptional = repository.findById(carrinhoProdutoRequest.getIdCarrinho());

            if (carrinhoShoppingOptional.isPresent()) {

                Produto produto = obterProduto(carrinhoProdutoRequest);

                CarrinhoShopping carrinhoShopping = carrinhoShoppingOptional.get().adicionarProduto(produto);

                carrinhoShopping = repository.save(carrinhoShopping);


                return converter.toCarrinhoShoppingResponse(carrinhoShopping);

            }

            return null;


        } catch (Exception exception) {
            throw new RuntimeException("Error");


        }
    }

    private Produto obterProduto(CarrinhoProdutoRequest carrinhoProdutoRequest) {
        return produtoRepository.findById(carrinhoProdutoRequest.getIdProduto()).orElseThrow(() -> new RuntimeException("Error ao buscar produto"));
    }

}
