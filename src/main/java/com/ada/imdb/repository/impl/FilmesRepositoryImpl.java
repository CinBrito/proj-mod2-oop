package com.ada.imdb.repository.impl;

public class FilmesRepositoryAction {

//    private static final List<Filme> filmes = new ArrayList<>();
//    private static int proximoId = 0;
//
//    private FilmesRepositoryAction() {}
//
//    public static Filme inserir(Filme filme) {
//        filme.setId(++proximoId);
//        filmes.add(filme);
//        return filme;
//    }
//
//    public static Filme atualizarNome(int id, String nome) throws Exception {
//        Optional<Filme> filme = filmes.stream().filter(f -> f.getId() == id).findFirst();
//        if (filme.isPresent()) {
//            filme.get().setNome(nome);
//            return filme.get();
//        }
//
//        throw new Exception("Filme não encontrado");
//    }
//
//    public static void excluir(int id) {
//        Optional<Filme> filme = filmes.stream().filter(f -> f.getId() == id).findFirst();
//        filme.ifPresent(value -> filmes.remove(value));
//    }
//
//    public static List<Filme> pesquisarPorNome(String nome) throws Exception {
//        if (nome != null && !nome.isEmpty()) {
//            return filmes.stream().filter(f -> f.getNome().contains(nome)).toList();
//        }
//
//        throw new Exception("Nome inválido");
//    }
//
//    public static List<Filme> getAll() {
//        return new ArrayList<>(filmes);
//    }
}
