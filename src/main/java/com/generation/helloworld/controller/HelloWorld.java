package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica que a classe abaixo é uma classe controladora.
@RequestMapping("/hello")//Cria os endpoint da aplicação
public class HelloWorld {
	
	@GetMapping
	public String hello() {
		return "Hello World";
	}
}
