package com.ada.imdb.repository;

import com.ada.imdb.model.Filme.Filme;
import java.util.List;

public interface FilmesRepository {

    public Filme inserir(Filme filme);

    public Filme atualizar(int id, Filme filme);

    public void excluir(int id);

    public List<Filme> pesquisarPorNome(String nome);
}