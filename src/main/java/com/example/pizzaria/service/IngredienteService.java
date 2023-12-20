package com.example.pizzaria.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.pizzaria.model.Ingredientes;
import com.example.pizzaria.repository.IngredienteRepository;

@Service
public class IngredienteService {

    @Autowired
    private IngredienteRepository ingredienteRepository;

    public Ingredientes adicionar(Ingredientes ingredientes) {
        if (ingredientes.getDataValidade().getTime() < new Date().getTime()) {
            throw new IllegalArgumentException("A data de validade deve ser maior que a data atual");
        }

        return ingredienteRepository.save(ingredientes);
    }

    public List<Ingredientes> obterTodos() {
        return ingredienteRepository.findAll();
    }

    public Ingredientes obterPorId(long id) {
        Optional<Ingredientes> optIngrediente = ingredienteRepository.findById(id);

        if (optIngrediente.isEmpty()) {
            throw new IllegalArgumentException("Não existe um ingrediente com o ID " + id);
        }
        return optIngrediente.get();
    }

}
