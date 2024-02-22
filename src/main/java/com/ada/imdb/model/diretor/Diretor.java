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

    public int getIdDiretor() {
        return idDiretor;
    }

    public void setIdDiretor(int idDiretor) {
        this.idDiretor = idDiretor;
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
        return "Diretor: " + nome +
                " (" + idDiretor +
                ") | País de Origem: " + paisOrigem +
                " | Data de Nascimento: " + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

}