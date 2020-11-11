package com.gabs.assertj.assertjchapter.application.controllers.requests;


import com.gabs.assertj.assertjchapter.domain.produto.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarrinhoProdutoRequestModel {

    @NotNull
    private Long idProduto;

    @NotNull
    private Integer quantidade;


}
