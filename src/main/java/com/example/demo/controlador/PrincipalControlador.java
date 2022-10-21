package com.example.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalControlador {
	
	@GetMapping("/appVotaciones")
	public String principal() {
		return "/Index";
	}
	
	@GetMapping("/candidato1")
	public String partido1() {
		return "/candidato1";
	}
	@GetMapping("/candidato2")
	public String partido2() {
		return "/candidato2";
	}
	@GetMapping("/Candidato3")
	public String partido3() {
		return "/Candidato3";
	}/*
	@GetMapping("/Candidato_4")
	public String partido4() {
		return "/Candidato_4";
	}*/
	@GetMapping("/Candidato_5")
	public String partido5() {
		return "/Candidato_5";
	}
}
