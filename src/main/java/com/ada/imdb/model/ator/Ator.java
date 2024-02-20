package com.ada.imdb.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ator {

    protected int idAtor;
    protected String nome;
    protected String paisOrigem;
    protected LocalDate dataNascimento;

    protected Ator(){
    }

    public static AtorBuilder builder(){
        return new AtorBuilder();
    }

    @Override
    public String toString() {
        return "Ator: " + nome +
                " (" + idAtor +
                ") | País de Origem: " + paisOrigem +
                " | Data de Nascimento: " + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}

