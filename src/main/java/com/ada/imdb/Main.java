package com.ada.imdb;

import com.ada.imdb.model.Filme;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Filme filme005 = new Filme("Star Wars: Episódio II - Ataque dos Clones");
        Filme filme006 = new Filme("Star Wars: Episódio III - A Vingança dos Sith");
        Filme filme007 = new Filme("Star Wars: Episódio IV - Uma Nova Esperança");
        Filme filme008 = new Filme("Star Wars: Episódio V - O Império Contra-ataca");
        FilmesRepository.inserir(new Filme("Star Wars: A Ascensão Skywalker"));
        FilmesRepository.inserir(new Filme("Star Wars: O Império Contra-ataca"));
        FilmesRepository.inserir(new Filme("Star Wars: Os Últimos Jedi"));
        FilmesRepository.inserir(new Filme("Star Wars: Episódio I - A Ameaça Fantasma"));
        FilmesRepository.inserir(filme005);
        FilmesRepository.inserir(filme006);
        FilmesRepository.inserir(filme007);
        FilmesRepository.inserir(filme008);

        FilmesRepository.excluir(filme005.getId());

        try{
            FilmesRepository.atualizarNome(filme006.getId(), "A lagoa azul");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        FilmesRepository.getAll().forEach(System.out::println);

        System.out.println("++++++++++++");
        List<Filme> filmes = FilmesRepository.pesquisarPorNome("Star Wars");
        filmes.forEach(System.out::println);
    }
}