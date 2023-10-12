package com.example.ExemploAula.repository;

		import com.example.ExemploAula.model.Compra;
		import org.springframework.data.jpa.repository.JpaRepository;
		import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long>, CustomQuerydslPredicateExecutor<Compra> {
}
