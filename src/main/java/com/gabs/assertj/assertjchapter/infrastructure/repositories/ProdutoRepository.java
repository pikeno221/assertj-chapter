package com.gabs.assertj.assertjchapter.infrastructure.repositories;

import com.gabs.assertj.assertjchapter.domain.produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {

}
