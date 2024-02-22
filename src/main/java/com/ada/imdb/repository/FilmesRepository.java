package com.ada.imdb.repository;

import com.ada.imdb.model.filme.Filme;

import java.util.List;

public interface FilmesRepository extends CrudRepository<Filme> {

    public List<Integer> getAtoresId(int idFilme);
    public List<Integer> getDiretoresId(int idFilme);
}
