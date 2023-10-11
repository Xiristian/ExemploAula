package com.example.ExemploAula.repostory;

		import com.example.ExemploAula.model.Locacao;
		import org.springframework.data.jpa.repository.JpaRepository;
		import org.springframework.stereotype.Repository;

@Repository
public interface LocacaoRepository extends JpaRepository<Locacao, Long>, CustomQuerydslPredicateExecutor<Locacao> {
}
