package com.gabs.assertj.assertjchapter.domain.carrinho;


import com.gabs.assertj.assertjchapter.domain.cliente.Cliente;
import com.gabs.assertj.assertjchapter.domain.produto.Produto;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.springframework.util.ObjectUtils.isEmpty;

@Entity
@Table(name = "carrinho_shopping")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarrinhoShopping implements Serializable {

    private static final long serialVersionUID = -5352385420884506224L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Cliente cliente;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Produto> produtos;


    private static Double valor;

    private static LocalDate dataAtualizacao;


    @PreUpdate
    public void beforeUpdate() {
        this.dataAtualizacao = LocalDate.now();

    }


    public CarrinhoShopping adicionarProduto(Produto produto) {

        this.produtos.add(produto);

        this.valor = getValor();

        return this;

    }

    public Double getValor() {

        if (isEmpty(this.produtos)) return 0.0;

        return this.produtos.stream().map(Produto::getValor).reduce(Double::sum).orElse(0.0);

    }


}
