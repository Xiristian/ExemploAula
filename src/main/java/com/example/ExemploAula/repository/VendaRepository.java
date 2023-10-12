package com.example.ExemploAula.repository;

		import com.example.ExemploAula.model.Venda;
		import org.springframework.data.jpa.repository.JpaRepository;
		import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long>, CustomQuerydslPredicateExecutor<Venda> {
}
