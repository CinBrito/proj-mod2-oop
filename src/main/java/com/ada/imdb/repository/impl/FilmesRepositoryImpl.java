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
    public List<Integer> getAtoresId(int idFilme) {
        for (Filme filme : filmes) {
            if (filme.getIdFilme() == idFilme) {
                return filme.getAtores().stream()
                        .map(Ator::getIdAtor)
                        .collect(Collectors.toList());
            }
        }
        return new ArrayList<>();
    }

    @Override
    public List<Integer> getDiretoresId(int idFilme) {
        for (Filme filme : filmes) {
            if (filme.getIdFilme() == idFilme) {
                return filme.getDiretores().stream()
                        .map(Diretor::getIdDiretor)
                        .collect(Collectors.toList());
            }
        }
        return new ArrayList<>();
    }
}