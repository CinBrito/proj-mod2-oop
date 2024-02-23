package com.ada.imdb.model.filme;

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

    public List<String> getGenero() {
        return genero;
    }

    public void setGenero(List<String> genero) {
        this.genero = genero;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    public List<Diretor> getDiretores() {
        return diretores;
    }

    public void setDiretores(List<Diretor> diretores) {
        this.diretores = diretores;
    }

    @Override
    public String toString() {
        return "Filme: " + titulo +
                " (" + idFilme + ")";
    }
}
