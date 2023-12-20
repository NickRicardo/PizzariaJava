package com.example.pizzaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pizzaria.model.Ingredientes;
import com.example.pizzaria.service.IngredienteService;

@RestController
@RequestMapping("/api/ingredientes") // Rota ou endPoint
@CrossOrigin("*") // Aceitar requisição de qualquer
public class IngredienteController {

    @Autowired
    private IngredienteService IngredienteService;

    @GetMapping
    public List<Ingredientes> obterTodos() {
        return IngredienteService.obterTodos();
    }

    @GetMapping("/{id}")
    public Ingredientes obterPorId(@PathVariable Long id) {
        return IngredienteService.obterPorId(id);
    }

    @PostMapping
    public Ingredientes adicionar(@RequestBody Ingredientes Ingredientes) {
        return IngredienteService.adicionar(Ingredientes);
    }

    @PutMapping("/{id}")
    public Ingredientes atualizar(@PathVariable Long id, @RequestBody Ingredientes Ingredientes) {
        return IngredienteService.atualizar(id, Ingredientes);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        IngredienteService.deletar(id);
    }

}
