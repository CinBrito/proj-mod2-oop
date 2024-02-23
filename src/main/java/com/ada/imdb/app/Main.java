package com.ada.imdb.app;

import com.ada.imdb.controller.AtorController;
import com.ada.imdb.controller.DiretorController;
import com.ada.imdb.controller.FilmesController;
import com.ada.imdb.dto.AtorDTO;
import com.ada.imdb.dto.DiretorDTO;
import com.ada.imdb.dto.FilmeDTO;
import com.ada.imdb.repository.impl.AtorRepositoryImpl;
import com.ada.imdb.repository.impl.DiretorRepositoryImpl;
import com.ada.imdb.repository.impl.FilmesRepositoryImpl;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando instâncias dos controllers
        AtorController atorController = new AtorController(new AtorRepositoryImpl());
        DiretorController diretorController = new DiretorController(new DiretorRepositoryImpl());
        FilmesController filmesController = new FilmesController(new FilmesRepositoryImpl());

        // Criando DTOs para Ator
        AtorDTO atorDTO001 = new AtorDTO(0, "Vin Diesel", "Estados Unidos", LocalDate.of(1967, 7, 18));
        AtorDTO atorDTO002 = new AtorDTO(0, "Paul Walker", "Estados Unidos", LocalDate.of(1973, 9, 12));
        AtorDTO atorDTO003 = new AtorDTO(0, "Dwayne Johnson", "Estados Unidos", LocalDate.of(1972, 5, 2));

        // Inserindo Atores
        atorController.inserirAtor(atorDTO001);
        atorController.inserirAtor(atorDTO002);
        atorController.inserirAtor(atorDTO003);

        // Criando DTOs para Diretor
        DiretorDTO diretorDTO001 = new DiretorDTO(0, "Quentin Tarantino", "Estados Unidos", LocalDate.of(1963, 3, 27));
        DiretorDTO diretorDTO002 = new DiretorDTO(0, "Steven Spielberg", "Estados Unidos", LocalDate.of(1946, 12, 18));
        DiretorDTO diretorDTO003 = new DiretorDTO(0, "Martin Scorsese", "Estados Unidos", LocalDate.of(1942, 11, 17));

        // Inserindo Diretores
        diretorController.inserirDiretor(diretorDTO001);
        diretorController.inserirDiretor(diretorDTO002);
        diretorController.inserirDiretor(diretorDTO003);

        // Criando DTOs para Filmes
        FilmeDTO filmeDTO001 = new FilmeDTO("Pulp Fiction", List.of("Crime"), Duration.ofMinutes(2 * 60 + 34), 1994, "L", 8.9, "A vida é bela", List.of(atorDTO001.toAtor(), atorDTO002.toAtor()), List.of(diretorDTO001.toDiretor()));
        FilmeDTO filmeDTO002 = new FilmeDTO("Kill Bill", List.of("Action"), Duration.ofMinutes(60 + 56), 2003, "L", 8.9, "A vida é bela", List.of(atorDTO001.toAtor(), atorDTO002.toAtor()), List.of(diretorDTO002.toDiretor()));
        FilmeDTO filmeDTO003 = new FilmeDTO("Kill Bill 2", List.of("Action"), Duration.ofMinutes(60 + 56), 2004, "L", 8.9, "A vida é bela", List.of(atorDTO003.toAtor(), atorDTO002.toAtor()), List.of(diretorDTO003.toDiretor()));

        // Inserindo Filmes
        filmesController.inserirFilme(filmeDTO001);
        filmesController.inserirFilme(filmeDTO002);
        filmesController.inserirFilme(filmeDTO003);

        // Pesquisando por nomes - filmes
        System.out.println(filmesController.pesquisarFilmePorNome("Kill Bill"));

        // Pesquisando por nomes - diretores
        System.out.println(diretorController.pesquisarDiretorPorNome("Quentin Tarantino"));

        // Pesquisando por nomes - atores
        System.out.println(atorController.pesquisarAtorPorNome("Vin Diesel"));

        // Pesquisando por filmes pelo id - diretores
        System.out.println(filmesController.pesquisarFilmePorDiretor(diretorDTO001.toDiretor().getIdDiretor()));

        // Pesquisando por filmes pelo id - atores
        System.out.println(filmesController.pesquisarFilmePorAtor(atorDTO001.toAtor().getIdAtor()));
    }
}
