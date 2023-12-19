package com.example.pizzaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pizzaria.model.Ingredientes;


public interface IngredienteRepository extends JpaRepository<Ingredientes, Long> {
    
}
