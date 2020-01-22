package com.project.japi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.japi.domain.Categoria;
import com.project.japi.repositories.CategoriaRepository;

@SpringBootApplication
public class JapiApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Categoria cat1 = new Categoria(null, "Redes de Computadores");
		Categoria cat2 = new Categoria(null, "Analise de Sistema");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
	}

}
