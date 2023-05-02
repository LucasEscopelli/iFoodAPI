package com.lucas.api.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.lucas.api.IfoodApiApplication;
import com.lucas.api.domain.modelo.Cozinha;
import com.lucas.domain.repository.CozinhaRepository;

public class BuscaCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(IfoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cadastroCozinha = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinhaEncontrada = cadastroCozinha.buscar(1L);
		System.out.println(cozinhaEncontrada.getNome());
	}
}
