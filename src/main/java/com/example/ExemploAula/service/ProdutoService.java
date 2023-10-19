package com.example.ExemploAula.service;

import com.example.ExemploAula.model.Produto;
import com.example.ExemploAula.model.QProduto;
import com.example.ExemploAula.repository.ProdutoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProdutoService {


	@Autowired
	private ProdutoRepository repository;

	@Autowired
	private ModelMapper modelMapper;


	public Produto salvar(Produto entity) {
		if (entity.getValorUnitario() < entity.getPrecoCompra()){
			throw new ValidationException("O valor unitário não pode ser menor que o preço de compra do produto!");
		}

		if (!repository.findAll(QProduto.produto.descricao.eq(entity.getDescricao())).isEmpty()){
			throw new ValidationException("Já existe um produto com essa descrição cadastrada!");
		}
		return repository.save(entity);
	}


	public List<Produto> buscaTodos() {
		return repository.findAll();
	}


	public Produto buscaPorId(Long id) {
		return repository.findById(id).orElse(null);
	}


	public Produto alterar(Long id, Produto entity) {
		Optional<Produto> existingProduoOptional = repository.findById(id);
		if (existingProduoOptional.isEmpty()){
			throw new NotFoundException("Produto não encontrado");
		}

		Produto existingProduto = existingProduoOptional.get();
		modelMapper.map(entity, existingProduto);
		return repository.save(existingProduto);
	}


	public void remover(Long id) {
		repository.deleteById(id);
	}
}