package com.gabs.assertj.assertjchapter.domain.carrinho;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarrinhoProdutoRequest {

    private Long idCarrinho;

    private Long idProduto;

    private Integer quantidade;


}
