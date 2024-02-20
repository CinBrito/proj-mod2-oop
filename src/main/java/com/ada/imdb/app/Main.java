package com.ada.imdb.app;

import com.ada.imdb.dto.FilmeDTO;
import com.ada.imdb.model.ator.Ator;
import com.ada.imdb.model.diretor.Diretor;
import com.ada.imdb.model.Filme.Filme;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

//        Filme filme005 = new Filme("Star Wars: Episódio II - Ataque dos Clones");
//        Filme filme006 = new Filme("Star Wars: Episódio III - A Vingança dos Sith");
//        Filme filme007 = new Filme("Star Wars: Episódio IV - Uma Nova Esperança");
//        Filme filme008 = new Filme("Star Wars: Episódio V - O Império Contra-ataca");
//        FilmesRepositoryAction.inserir(new Filme("Star Wars: A Ascensão Skywalker"));
//        FilmesRepositoryAction.inserir(new Filme("Star Wars: O Império Contra-ataca"));
//        FilmesRepositoryAction.inserir(new Filme("Star Wars: Os Últimos Jedi"));
//        FilmesRepositoryAction.inserir(new Filme("Star Wars: Episódio I - A Ameaça Fantasma"));
//        FilmesRepositoryAction.inserir(filme005);
//        FilmesRepositoryAction.inserir(filme006);
//        FilmesRepositoryAction.inserir(filme007);
//        FilmesRepositoryAction.inserir(filme008);
//
//        FilmesRepositoryAction.excluir(filme005.getId());
//
//        try{
//            FilmesRepositoryAction.atualizarNome(filme006.getId(), "A lagoa azul");
//        } catch(Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        FilmesRepositoryAction.getAll().forEach(System.out::println);
//
//        System.out.println("++++++++++++");
//        List<Filme> filmes = FilmesRepositoryAction.pesquisarPorNome("Star Wars");
//        filmes.forEach(System.out::println);

        Ator ator1 = Ator.builder().nome("Keanu Reeves").paisOrigem("Canadá").dataNascimento(LocalDate.of(1964,9,2)).build();
        Diretor diretor1 = Diretor.builder().nome("Lilly Wachowski").dataNascimento(LocalDate.of(1967,12,29)).paisOrigem("EUA").build();
        Diretor diretor2 = Diretor.builder().nome("Lana Wachowski").dataNascimento(LocalDate.of(1965,6,21)).paisOrigem("EUA").build();
        Filme filme1 = Filme.builder().titulo("Matrix").ano(1999).duracao(Duration.ofHours(2).plusMinutes(16)).atores(List.of(ator1)).diretores(List.of(diretor1,diretor2)).genero(List.of("Ação","Ficção Científica")).build();

        System.out.println(filme1);

        FilmeDTO filme2 = new FilmeDTO("Assassinos da Lua das Flores",List.of("Suspense", "Drama"),Duration.ofHours(3).plusMinutes(20),2023,"14",6.5,"Bla bla bla",List.of(ator1),List.of(diretor1));




    }
}