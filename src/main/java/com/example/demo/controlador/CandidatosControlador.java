package com.example.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CandidatosControlador {
   
    @GetMapping ("/inicio")
    public String Inicio() {
        return "/Candidato3";
    }
    @GetMapping ("/Cand2")
    public String Cand2() {
        return "/Candidato2";
    }
    @GetMapping ("/Cand1")
    public String Cand1() {
        return "/Candidato1";
    }

}
