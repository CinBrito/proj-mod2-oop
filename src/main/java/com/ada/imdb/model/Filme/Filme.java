package com.ada.imdb.model.Filme;

import com.ada.imdb.model.ator.Ator;
import com.ada.imdb.model.diretor.Diretor;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filme {
    protected int idFilme;
    protected String titulo;
    protected List<String> genero;
    protected Duration duracao;
    protected int ano;
    protected String classificacao;
    protected double nota;
    protected String sinopse;
    protected List<Ator> atores = new ArrayList<>();
    protected List<Diretor> diretores = new ArrayList<>();

    protected Filme(){

    }

    public static FilmeBuilder builder() {
        return new FilmeBuilder();
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Filme: " + titulo +
                " (" + idFilme +
                ") | Data de Lançamento: " + ano +
                " | Duração: " + duracao +
                " | Diretores: " + String.join(", ", diretores.stream()
                .map(Diretor::getNome)
                .collect(Collectors.toList()));
    }
}
