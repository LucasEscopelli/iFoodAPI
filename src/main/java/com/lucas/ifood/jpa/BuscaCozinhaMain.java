package com.lucas.ifood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.lucas.ifood.IfoodApiApplication;
import com.lucas.ifood.domain.model.Cozinha;
import com.lucas.ifood.domain.repository.CozinhaRepository;

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
