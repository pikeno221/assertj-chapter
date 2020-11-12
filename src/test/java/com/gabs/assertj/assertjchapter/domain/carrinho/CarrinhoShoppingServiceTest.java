package com.gabs.assertj.assertjchapter.domain.carrinho;

import com.gabs.assertj.assertjchapter.application.controllers.converters.CarrinhoShoppingConverter;
import com.gabs.assertj.assertjchapter.infrastructure.repositories.CarrinhoShoppingRepository;
import com.gabs.assertj.assertjchapter.infrastructure.repositories.ProdutoRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CarrinhoShoppingServiceTest {

    @Mock
    private CarrinhoShoppingConverter carrinhoShoppingConverter;

    @Mock
    private CarrinhoShoppingRepository carrinhoShoppingRepository;

    @Mock
    private ProdutoRepository produtoRepository;

    @InjectMocks
    private CarrinhoShoppingService carrinhoShoppingService;


    @Before
    public void setUp() {


    }


    @Test
    public void deveRetornarCarrinhoComProdutoAdicionadoAoFimDoFluxoDeExecucaoDoMetodoDeAdicionarProdutoAoCarrinho() {


    }



}