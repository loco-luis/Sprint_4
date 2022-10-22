package com.example.demo.servicios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidades.Votante;

@Repository
public interface VotanteService extends JpaRepository<Votante, Integer>{

}