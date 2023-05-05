package com.lucas.ifood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lucas.ifood.domain.model.Cidade;
import com.lucas.ifood.domain.repository.CidadeRepository;

//@RestController
//@RequestMapping("/cidades")
public class CidadeController {

	@Autowired
	private CidadeRepository cidadeRepository;
//	
//	@GetMapping
	public List<Cidade> listar(){
		return cidadeRepository.listar();
	}
	
}
