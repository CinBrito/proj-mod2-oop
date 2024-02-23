package com.ada.imdb.controller;


import com.ada.imdb.dto.AtorDTO;
import com.ada.imdb.dto.DiretorDTO;
import com.ada.imdb.dto.FilmeDTO;
import com.ada.imdb.model.ator.Ator;
import com.ada.imdb.model.diretor.Diretor;
import com.ada.imdb.model.filme.Filme;
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

    public Filme atualizarFilme(int id, FilmeDTO filme) {
        return filmesRepository.atualizar(id, filme.toFilme());
    }

    public void excluirFilme(int id) {
        filmesRepository.excluir(id);
    }

    public List<Filme> pesquisarFilmePorNome(String nome) {
        return filmesRepository.pesquisarPorNome(nome);
    }

    public List<Filme> pesquisarFilmePorDiretor(int idDiretor) {
        return filmesRepository.pesquisarPorDiretor(idDiretor);
    }

    public List<Filme> pesquisarFilmePorAtor(int idAtor) {
        return filmesRepository.pesquisarPorAtor(idAtor);
    }

    public List<Filme> listarFilmes() {
        return filmesRepository.listarTodos();
    }

    public Diretor adicionarDiretor(int idFilme, DiretorDTO diretor) {
        return filmesRepository.adicionarDiretor(idFilme, diretor.toDiretor());
    }

    public Ator adicionarAtor(int idFilme, AtorDTO ator) {
        return filmesRepository.adicionarAtor(idFilme, ator.toAtor());
    }
}

