package com.ada.imdb.model.diretor;

import java.time.LocalDate;

public class DiretorBuilder {

    protected DiretorBuilder() {

    }

    private final Diretor diretor = new Diretor();

    public DiretorBuilder idDiretor (int idDiretor) {
        this.diretor.idDiretor = idDiretor;
        return this;
    }

    public DiretorBuilder nome(String nome) {
        this.diretor.nome = nome;
        return this;
    }

    public DiretorBuilder paisOrigem(String paisOrigem) {
        this.diretor.paisOrigem = paisOrigem;
        return this;
    }

    public DiretorBuilder dataNascimento (LocalDate dataNascimento) {
        this.diretor.dataNascimento = dataNascimento;
        return this;
    }

    public Diretor build() {
        return this.diretor;
    }

}
