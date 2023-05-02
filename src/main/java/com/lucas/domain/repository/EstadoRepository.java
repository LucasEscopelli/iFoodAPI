package com.lucas.domain.repository;

import java.util.List;

import com.lucas.api.domain.modelo.Estado;

public interface EstadoRepository {
	List<Estado> listar();
	Estado buscar(Long id);
	Estado salvar(Estado estado);
	void remover(Estado estado);
}
