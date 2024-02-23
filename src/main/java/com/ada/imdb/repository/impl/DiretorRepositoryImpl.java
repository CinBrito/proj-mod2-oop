package com.ada.imdb.repository.impl;

import com.ada.imdb.model.catalogo.Catalogo;
import com.ada.imdb.model.diretor.Diretor;
import com.ada.imdb.repository.DiretorRepository;
import java.util.List;
import java.util.stream.Collectors;

public class DiretorRepositoryImpl implements DiretorRepository {

    private final List<Diretor> diretores = Catalogo.getInstance().getDiretores();
    private int contador = 0;

    @Override
    public Diretor inserir(Diretor diretor) {
        diretor.setIdDiretor(++contador);
        diretores.add(diretor);
        return diretor;
    }

    @Override
    public Diretor atualizar(int id, Diretor diretor) {
        for (int i = 0; i < diretores.size(); i++) {
            Diretor d = diretores.get(i);
            if (d.getIdDiretor() == id) {
                diretor.setIdDiretor(id);
                diretores.set(i, diretor);
                return diretor;
            }
        }
        return null;
    }

    @Override
    public void excluir(int id) {
        diretores.removeIf(diretor -> diretor.getIdDiretor() == id);
    }

    @Override
    public List<Diretor> pesquisarPorNome(String nome) {
        return diretores.stream()
                .filter(diretor -> diretor.getNome().equalsIgnoreCase(nome))
                .collect(Collectors.toList());
    }

    @Override
    public List<Diretor> listarTodos() {
        return diretores.stream().toList();
    }
}
