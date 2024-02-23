package com.ada.imdb.controller;

import com.ada.imdb.dto.AtorDTO;
import com.ada.imdb.model.ator.Ator;
import com.ada.imdb.repository.AtorRepository;
import java.util.List;

public class AtorController {

    private final AtorRepository atorRepository;

    public AtorController(AtorRepository atorRepository) {
        this.atorRepository = atorRepository;
    }

    public Ator inserirAtor(AtorDTO ator) {
        return atorRepository.inserir(ator.toAtor());
    }

    public Ator atualizarAtor(int id, AtorDTO ator) {
        return atorRepository.atualizar(id, ator.toAtor());
    }

    public void excluirAtor(int id) {
        atorRepository.excluir(id);
    }

    public List<Ator> pesquisarAtorPorNome(String nome) {
        return atorRepository.pesquisarPorNome(nome);
    }
}
