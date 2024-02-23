package com.ada.imdb.repository;

import com.ada.imdb.model.filme.Filme;

import java.util.List;

public interface FilmesRepository extends CrudRepository<Filme> {

    public List<Filme> pesquisarPorAtor(int idAtor);
    public List<Filme> pesquisarPorDiretor(int idDiretor);
}
