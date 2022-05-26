package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aprendizados")
public class Aprendizados {

	@GetMapping
	public String Metas() {
		return "Aprender conceitos iniciais Spring<br>Aprender um pouco mais sobre figma e quants ux";
	}
}
