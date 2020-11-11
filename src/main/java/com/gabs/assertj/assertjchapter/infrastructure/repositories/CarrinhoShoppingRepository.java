package com.gabs.assertj.assertjchapter.infrastructure.repositories;

import com.gabs.assertj.assertjchapter.domain.carrinho.CarrinhoShopping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoShoppingRepository extends JpaRepository<CarrinhoShopping, Long> {
}
