package com.example.ExemploAula.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;
import com.querydsl.core.types.Predicate;

public interface CustomQuerydslPredicateExecutor<T> extends QuerydslPredicateExecutor<T> {

	@Override
	List<T> findAll(Predicate predicate);

}
