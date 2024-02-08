package com.ada.imdb.model;

import java.time.Duration;
import java.time.format.DateTimeFormatter;
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
