package com.lucas.domain.repository;

import java.util.List;

import com.lucas.api.domain.modelo.Permissao;

public interface PermissaoRepository {
	List<Permissao> listar();
	Permissao buscar(Long id);
	Permissao salvar(Permissao rermissao);
	void remover(Permissao rermissao);
}
