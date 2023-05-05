package com.lucas.ifood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.lucas.ifood.domain.exception.EntidadeEmUsoException;
import com.lucas.ifood.domain.exception.EntidadeNãoEncontradaException;
import com.lucas.ifood.domain.model.Cozinha;
import com.lucas.ifood.domain.repository.CozinhaRepository;

@Service
public class CadastroCozinhaService {

	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	public Cozinha salvar(Cozinha cozinha) {
		return cozinhaRepository.salvar(cozinha);
	}
	
	public void excluir(Long cozinhaId) {
		try {			
			cozinhaRepository.remover(cozinhaId);
			
		}catch(EmptyResultDataAccessException e){
			throw new EntidadeNãoEncontradaException(
					String.format("A cozinha de código %d não pôde ser encontrada.", cozinhaId));
			
		}catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(
					String.format("Cozinha de código %d não pôde ser removida pois está em uso.", cozinhaId));
			
		}
	}
	
}
