package com.ada.imdb.repository;

import com.ada.imdb.model.Filme;

import java.util.List;

public interface FilmesRepository{

    public default Filme inserir(Filme filme) {
        return null;
    }

    public Filme atualizar(Filme filme);

    public void excluir(Filme filme);

    public List<Filme> pesquisarPorNome(String nome);

}