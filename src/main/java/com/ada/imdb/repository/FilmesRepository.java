package com.ada.imdb.repository;

import com.ada.imdb.model.ator.Ator;
import com.ada.imdb.model.diretor.Diretor;
import com.ada.imdb.model.filme.Filme;

import java.util.List;

public interface FilmesRepository extends CrudRepository<Filme> {

    public List<Filme> pesquisarPorAtor(int idAtor);
    public List<Filme> pesquisarPorDiretor(int idDiretor);
    public Diretor adicionarDiretor(int idFilme, Diretor diretor);
    public Ator adicionarAtor(int idFilme, int idAtor);
}
