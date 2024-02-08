package com.ada.imdb.model;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private int id;
    private String nome;
    private String genero;
    private String ano;
    private String classificacao;
    private double nota;
    private String sinopse;
    List<Ator> atores = new ArrayList<>();
    List<Diretor> diretores = new ArrayList<>();

    public Filme(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
