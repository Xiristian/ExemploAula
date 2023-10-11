package com.example.ExemploAula.service;

import com.example.ExemploAula.model.Produto;
import com.example.ExemploAula.model.QProduto;
import com.example.ExemploAula.model.Status;
import com.example.ExemploAula.repostory.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	public List<Produto> findProdutosAlugados() {
		List<Produto> alugados = repository.findAll(QProduto.produto.status.eq(Status.ALUGADO));
		return alugados;
	}
}