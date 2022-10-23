package com.example.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entidades.Votante;
import com.example.demo.servicios.VotanteService;

@Controller
public class VotanteControlador {

	@Autowired
	private VotanteService votanteService;

	@GetMapping("/listaVotante")
	public String listarVotantes(Model model) {
		try {
			List<Votante> listVotante = votanteService.findAll();
			model.addAttribute("votantes", listVotante);
		} catch (Exception e) {
			System.out.println("Error. " + e.getCause());
		}
		return "/listaVotante";
	}

	@GetMapping("/nuevoVotante")
	public String addVotante(Model model) {
		model.addAttribute("votantes", new Votante());
		return "/addVotante";
	}

	@PostMapping("/saveVotante")
	public String GuardarVotante(@Validated Votante votante) {
		System.out.println("Votante-->" + votante.toString());
		votanteService.save(votante);
		return "redirect:/listaVotante";

	}

	@GetMapping("/mostrarInfo/{id}")
	public String mostrar(@PathVariable int id, Model model) {
		Optional<Votante> muestra = votanteService.findById(id);
		model.addAttribute("votantes", muestra.get());
		return "/show";
	}
}
