package com.ada.imdb.controller;

import com.ada.imdb.dto.DiretorDTO;
import com.ada.imdb.model.diretor.Diretor;
import com.ada.imdb.repository.DiretorRepository;
import java.util.List;

public class DiretorController {

    private final DiretorRepository diretorRepository;

    public DiretorController(DiretorRepository diretorRepository) {
        this.diretorRepository = diretorRepository;
    }

    public Diretor inserirDiretor(DiretorDTO diretor) {
        return diretorRepository.inserir(diretor.toDiretor());
    }

    public Diretor atualizarDiretor(int id, DiretorDTO diretor) {
        return diretorRepository.atualizar(id, diretor.toDiretor());
    }

    public void excluirDiretor(int id) {
        diretorRepository.excluir(id);
    }

    public List<Diretor> pesquisarDiretorPorNome(String nome) {
        return diretorRepository.pesquisarPorNome(nome);
    }

    public List<Diretor> listarDiretores() {
        return diretorRepository.listarTodos();
    }
}
