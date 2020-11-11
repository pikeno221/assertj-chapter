package com.gabs.assertj.assertjchapter.application.controllers.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoResponseModel implements Serializable {

    private static final long serialVersionUID = 8115535497559934695L;

    private Long id;

    private String nome;
}
