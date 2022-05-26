package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generation")
public class HabilidadesComportamentos {
	@GetMapping
	public String exibirBsm() {
		return "Mentalidade de Crescimento<br>Orintação ao futuro<br>Persistência<br>responsbilidade pessoal"
				+ "<br>trabalho em equipe<br>atenção aos detalhes<br>Proatividade<br>comunicação";
	}
}
