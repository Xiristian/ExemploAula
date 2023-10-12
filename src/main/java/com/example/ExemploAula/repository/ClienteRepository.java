package com.example.ExemploAula.repository;

		import com.example.ExemploAula.model.Cliente;
		import org.springframework.data.jpa.repository.JpaRepository;
		import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>, CustomQuerydslPredicateExecutor<Cliente> {
}
