package com.ada.imdb.model.diretor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Diretor {

    protected int idDiretor;
    protected String nome;
    protected String paisOrigem;
    protected LocalDate dataNascimento;

    protected Diretor() {
    }

    public static DiretorBuilder builder() {
        return new DiretorBuilder();
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Diretor: " + nome +
                " (" + idDiretor +
                ") | País de Origem: " + paisOrigem +
                " | Data de Nascimento: " + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

}