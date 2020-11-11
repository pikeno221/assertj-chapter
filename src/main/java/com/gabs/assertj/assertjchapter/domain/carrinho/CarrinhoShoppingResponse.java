package com.gabs.assertj.assertjchapter.domain.carrinho;

import com.gabs.assertj.assertjchapter.domain.produto.ProdutoResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarrinhoShoppingResponse {

    private List<ProdutoResponse> produtos;

    private Double valor;

}
