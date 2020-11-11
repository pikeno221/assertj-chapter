package com.gabs.assertj.assertjchapter.application.controllers.responses;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarrinhoShoppingResponseModel implements Serializable {

    private static final long serialVersionUID = -5563711050951481762L;

    private List<ProdutoResponseModel> produtos;

    private Double valor;


}
