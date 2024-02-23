package com.ada.imdb.repository.impl;

import com.ada.imdb.model.ator.Ator;
import com.ada.imdb.model.catalogo.Catalogo;
import com.ada.imdb.repository.AtorRepository;

import java.util.List;

public class AtorRepositoryImpl implements AtorRepository {

    private final List<Ator> atores = Catalogo.getInstance().getAtores();
    private int contador = 0;

    @Override
    public Ator inserir(Ator ator) {
        ator.setIdAtor(++contador);
        atores.add(ator);
        return ator;
    }

    @Override
    public Ator atualizar(int id, Ator ator) {
        atores.forEach(a -> {
            if (a.getIdAtor() == id) {
                a.setIdAtor(id);
                a.setNome(ator.getNome());
                a.setPaisOrigem(ator.getPaisOrigem());
                a.setDataNascimento(ator.getDataNascimento());
            }
        });
        return null;
    }

    @Override
    public void excluir(int id) {
        atores.removeIf(ator -> ator.getIdAtor() == id);
    }

    @Override
    public List<Ator> pesquisarPorNome(String nome) {
        return atores.stream().filter(ator -> ator.getNome().toLowerCase().contains(nome.toLowerCase())).toList();
    }

    @Override
    public List<Ator> listarTodos() {
        return atores.stream().toList();
    }
}
