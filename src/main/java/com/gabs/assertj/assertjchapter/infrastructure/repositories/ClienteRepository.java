package com.gabs.assertj.assertjchapter.infrastructure.repositories;

import com.gabs.assertj.assertjchapter.domain.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
