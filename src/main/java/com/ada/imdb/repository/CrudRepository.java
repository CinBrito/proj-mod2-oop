package com.ada.imdb.repository;

import java.util.List;

public interface CrudRepository<T> {

    public T inserir(T t);

    public T atualizar(int id, T t);

    public void excluir(int id);

    public List<T> pesquisarPorNome(String nome);

    public List<T> listarTodos();
}