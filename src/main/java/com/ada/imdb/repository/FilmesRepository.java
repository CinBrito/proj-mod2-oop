package com.ada.imdb.repository;

import com.ada.imdb.model.Filme;

import java.util.List;

public interface FilmesRepository{

    public Filme inserir(Filme filme);

    public Filme atualizar(Filme filme);

    public void excluir(Filme filme);

    public List<Filme> pesquisarPorNome(String nome);

}