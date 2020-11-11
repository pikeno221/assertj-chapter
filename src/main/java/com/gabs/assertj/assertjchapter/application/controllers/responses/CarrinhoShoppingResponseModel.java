package com.gabs.assertj.assertjchapter.application.controllers.responses;

import com.gabs.assertj.assertjchapter.domain.produto.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarrinhoShoppingResponseModel implements Serializable {

    private List<ProdutoResponseModel> produtos;

    private Double valor;


}
