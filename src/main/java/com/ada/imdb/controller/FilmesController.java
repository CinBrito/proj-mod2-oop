package com.ada.imdb.controller;


import com.ada.imdb.dto.FilmeDTO;
import com.ada.imdb.model.Filme.Filme;
import com.ada.imdb.repository.FilmesRepository;

import java.util.List;

public class FilmesController {

    private final FilmesRepository filmesRepository;

    public FilmesController(FilmesRepository filmesRepository) {
        this.filmesRepository = filmesRepository;
    }

    public Filme inserirFilme(FilmeDTO filme) {
        return filmesRepository.inserir(filme.toFilme());
    }

    public Filme atualizarFilme(int id, Filme filme) {
        return filmesRepository.atualizar(id, filme);
    }

    public void excluirFilme(int id) {
        filmesRepository.excluir(id);
    }

    public List<Filme> pesquisarFilmePorNome(String nome) {
        return filmesRepository.pesquisarPorNome(nome);
    }
}
