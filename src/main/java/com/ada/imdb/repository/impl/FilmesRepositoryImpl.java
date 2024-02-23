package com.ada.imdb.repository.impl;

import com.ada.imdb.model.ator.Ator;
import com.ada.imdb.model.catalogo.Catalogo;
import com.ada.imdb.model.diretor.Diretor;
import com.ada.imdb.model.filme.Filme;
import com.ada.imdb.repository.FilmesRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilmesRepositoryImpl implements FilmesRepository {

    private final List<Filme> filmes = Catalogo.getInstance().getFilmes();
    private int contador = 0;

    @Override
    public Filme inserir(Filme filme) {
        filme.setIdFilme(++contador);
        filmes.add(filme);
        return filme;
    }

    @Override
    public Filme atualizar(int id, Filme filme) {
        for (int i = 0; i < filmes.size(); i++) {
            if (filmes.get(i).getIdFilme() == id) {
                filme.setIdFilme(filmes.get(i).getIdFilme());
                filmes.set(i, filme);
                return filme;
            }
        }

        return null;
    }

    @Override
    public void excluir(int id) {
        filmes.removeIf(filme -> filme.getIdFilme() == id);
    }

    @Override
    public List<Filme> pesquisarPorNome(String titulo) {
        return filmes.stream().filter(filme -> filme.getTitulo().toLowerCase().contains(titulo.toLowerCase())).toList();
    }

    @Override
    public List<Filme> pesquisarPorAtor(int idAtor) {
        List<Filme> filmesDoAtor = new ArrayList<>();

        for (Filme filme : filmes) {
            for (Ator ator : filme.getAtores()) {
                if (ator.getIdAtor() == idAtor) {
                    filmesDoAtor.add(filme);
                    break; // Se o ator estiver no filme, não é necessário verificar os outros atores do mesmo filme
                }
            }
        }

        return filmesDoAtor;
    }

    @Override
    public List<Filme> pesquisarPorDiretor(int idDiretor) {
        List<Filme> filmesDoDiretor = new ArrayList<>();

        for (Filme filme : filmes) {
            for (Diretor diretor : filme.getDiretores()) {
                if (diretor.getIdDiretor() == idDiretor) {
                    filmesDoDiretor.add(filme);
                    break; // Se o diretor estiver no filme, não é necessário verificar os outros diretores do mesmo filme
                }
            }
        }

        return filmesDoDiretor;
    }

}