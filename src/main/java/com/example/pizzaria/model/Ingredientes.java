package com.example.pizzaria.model;

import java.util.Date;

import com.example.pizzaria.model.Enum.EUnidadeMedida;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.Table;

@Entity
public class Ingredientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingrediente")
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private Date dataValidade;

    private Double valor;

    @Column(nullable = false)
    private EUnidadeMedida medida;
    
    private String observacao;


    //#region Get's and Set's
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public EUnidadeMedida getMedida() {
        return medida;
    }

    public void setMedida(EUnidadeMedida medida) {
        this.medida = medida;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    //#endregion
}
