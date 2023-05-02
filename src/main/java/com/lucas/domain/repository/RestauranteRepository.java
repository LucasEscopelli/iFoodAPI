package com.lucas.domain.repository;

import java.util.List;

import com.lucas.api.domain.modelo.Restaurante;

public interface RestauranteRepository {
	
	List<Restaurante> listar();
	Restaurante buscar(Long id);
	Restaurante salvar(Restaurante restaurante);
	void remover(Restaurante restaurante);

}
