package com.ada.imdb.model.ator;

import java.time.LocalDate;

public class AtorBuilder {

    protected AtorBuilder() {

    }
    private final Ator ator = new Ator();

    public AtorBuilder idAtor(int idAtor) {
        this.ator.idAtor = idAtor;
        return this;
    }

    public AtorBuilder nome(String nome) {
        this.ator.nome = nome;
        return this;
    }

    public AtorBuilder paisOrigem(String paisOrigem) {
        this.ator.paisOrigem = paisOrigem;
        return this;
    }

    public AtorBuilder dataNascimento(LocalDate dataNascimento) {
        this.ator.dataNascimento = dataNascimento;
        return this;
    }

    public Ator build() {
        Ator ator = new Ator();
        return this.ator;
    }
}
