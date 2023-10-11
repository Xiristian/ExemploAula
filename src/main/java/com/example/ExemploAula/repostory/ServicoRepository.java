package com.example.ExemploAula.repostory;

		import com.example.ExemploAula.model.Servico;
		import org.springframework.data.jpa.repository.JpaRepository;
		import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long>, CustomQuerydslPredicateExecutor<Servico> {
}
