package com.gabs.assertj.assertjchapter;

import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoShopping;
import com.gabs.assertj.assertjchapter.domain.cliente.Cliente;
import com.gabs.assertj.assertjchapter.domain.produto.Produto;
import com.gabs.assertj.assertjchapter.infrastructure.repositories.CarrinhoShoppingRepository;
import com.gabs.assertj.assertjchapter.infrastructure.repositories.ClienteRepository;
import com.gabs.assertj.assertjchapter.infrastructure.repositories.ProdutoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static java.util.Arrays.asList;

@SpringBootApplication
@Slf4j
public class AssertjChapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssertjChapterApplication.class, args);
    }


    @Bean
    public CommandLineRunner loadData(ClienteRepository clienteRepository, ProdutoRepository produtoRepository, CarrinhoShoppingRepository carrinhoShoppingRepository) {
        return (args) -> {

            Cliente clienteGabriel = Cliente.builder().nome("Gabs").build();


            Produto produtoMacbook = Produto.builder().nome("Macbook").valor(Double.valueOf(6500)).build();

            Produto produtoS20 = Produto.builder().nome("Samsung S20").valor(Double.valueOf(6000)).build();

            CarrinhoShopping carrinhoShopping = CarrinhoShopping.builder().cliente(clienteGabriel).produtos(asList(produtoMacbook, produtoS20)).build();

            carrinhoShoppingRepository.save(carrinhoShopping);

            Produto produtoTravesseiro = Produto.builder().nome("travesseriro").valor(Double.valueOf(60)).build();

            produtoRepository.save(produtoTravesseiro);

            log.info("dados inseridos com sucesso. ");

        };
    }

}
