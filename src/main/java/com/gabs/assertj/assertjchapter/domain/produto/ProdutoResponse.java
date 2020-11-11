package com.gabs.assertj.assertjchapter.domain.produto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProdutoResponse {

    private Long id;

    private String nome;

    private Double valor;

}
