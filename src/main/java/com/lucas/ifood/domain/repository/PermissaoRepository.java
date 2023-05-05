package com.lucas.ifood.domain.repository;

import java.util.List;

import com.lucas.ifood.domain.model.Permissao;

public interface PermissaoRepository {
	List<Permissao> listar();
	Permissao buscar(Long id);
	Permissao salvar(Permissao rermissao);
	void remover(Permissao rermissao);
}
