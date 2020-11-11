package com.gabs.assertj.assertjchapter.domain.carrinho;

import lombok.Data;
import lombok.Getter;

@Data
public class CarrinhoProdutoRequest {

    private Long idCarrinho;

    private Integer idProduto;

    private Integer quantidade;


}
