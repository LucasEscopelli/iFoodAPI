package com.lucas.domain.repository;

import java.util.List;

import com.lucas.api.domain.modelo.Cidade;

public interface CidadeRepository {
	List<Cidade> listar();
	Cidade buscar(Long id);
	Cidade salvar(Cidade cidade);
	void remover(Cidade cidade);
}
