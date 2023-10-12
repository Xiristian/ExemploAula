package com.example.ExemploAula.repository;

import com.example.ExemploAula.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>, CustomQuerydslPredicateExecutor<Produto> {
}
