package com.ada.imdb.model.ator;

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

    public int getIdAtor() {
        return idAtor;
    }

    public void setIdAtor(int idAtor) {
        this.idAtor = idAtor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Ator: " + nome +
                " (" + idAtor +
                ") | País de Origem: " + paisOrigem +
                " | Data de Nascimento: " + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}

