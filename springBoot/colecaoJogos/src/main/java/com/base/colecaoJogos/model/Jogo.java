package com.base.colecaoJogos.model;

import org.hibernate.annotations.Tables;


public class Jogo {

    Integer id;
    String nome;
    String tipo;
    String genero;

    public Jogo(final Integer id, final String nome, final String tipo, final String genero){
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
