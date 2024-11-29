package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}


	@GetMapping("/bsms")
	public List<String> getBSMs() {
	   return Arrays.asList(
	       "Mentalidade de Crescimento", 
	       "Orientação ao Futuro", 
	       "Responsabilidade Pessoal", 
	       "Persistência",
	       "Comunicação", 
	       "Trabalho em Equipe",
	       "Proatividade", 
	       "Orientação ao Detalhe");
	    }

	    @GetMapping("/goals")
	    public List<String> getLearningGoals() {
	        return Arrays.asList(
	           "Aprender Spring Boot",
	           "Implementar REST APIs",
	           "Entender os princípios de Injeção de Dependência",
	           "Desenvolver aplicações com Java");
	    }
	}

