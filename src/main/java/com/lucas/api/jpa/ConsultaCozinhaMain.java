package com.lucas.api.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.lucas.api.IfoodApiApplication;
import com.lucas.api.domain.modelo.Cozinha;
import com.lucas.domain.repository.CozinhaRepository;

public class ConsultaCozinhaMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(IfoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cadastroCozinha = applicationContext.getBean(CozinhaRepository.class);
		List<Cozinha> cozinhas = cadastroCozinha.listar();
		
		for(Cozinha cozinha: cozinhas) {
			System.out.printf(cozinha.getNome() + "\n");
		}
	}
	
}
