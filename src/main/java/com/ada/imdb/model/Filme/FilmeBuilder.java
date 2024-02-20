package com.ada.imdb.model.Filme;

import com.ada.imdb.model.ator.Ator;
import com.ada.imdb.model.diretor.Diretor;

import java.time.Duration;
import java.util.List;

public class FilmeBuilder {

    private final Filme filme = new Filme();

//    private List<Ator> atores = new ArrayList<>();
//
//    private List<Diretor> diretores = new ArrayList<>();

    protected FilmeBuilder(){

    }

    public FilmeBuilder idFilme (int idFilme) {
        this.filme.idFilme = idFilme;
        return this;
    }

    public FilmeBuilder titulo (String titulo) {
        this.filme.titulo = titulo;
        return this;
    }

    public FilmeBuilder genero (List<String> genero) {
        this.filme.genero = genero;
        return this;
    }


    public FilmeBuilder duracao (Duration duracao) {
        this.filme.duracao = duracao;
        return this;
    }
    public FilmeBuilder ano (int ano) {
        this.filme.ano =  ano;
        return this;
    }

    public FilmeBuilder classificacao (String classificacao) {
        this.filme.classificacao = classificacao;
        return this;
    }

    public FilmeBuilder nota (double nota) {
        this.filme.nota = nota;
        return this;
    }

    public FilmeBuilder sinopse (String sinopse) {
        this.filme.sinopse = sinopse;
        return this;
    }

    public  FilmeBuilder atores (List<Ator> atores) {
        this.filme.atores = atores;
        return this;
    }

    public FilmeBuilder diretores (List<Diretor> diretores) {
        this.filme.diretores = diretores;
        return this;
    }

    public Filme build() {
        return this.filme;
    }
}
