package com.ada.imdb.model.Filme;

import com.ada.imdb.model.ator.Ator;
import com.ada.imdb.model.diretor.Diretor;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public record FilmeDTO(int idFilme, String titulo, List<String> genero, Duration duracao, int ano,
                    String classificacao, double nota, String sinopse, List<Ator> atores,
                    List<Diretor> diretores) {

    public static FilmeBuilder builder() {
        return new FilmeBuilder();
    }

    @Override
    public String toString() {
        return "Filme: " + titulo +
                " (" + idFilme +
                ") | Data de Lançamento: " + ano +
                " | Duração: " + duracao +
                " | Diretores: " + String.join(", ", diretores.stream()
                .map(Diretor::getNome)
                .collect(Collectors.toList()));
    }
}
