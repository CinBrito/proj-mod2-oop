package com.ada.imdb.dto;


import com.ada.imdb.model.filme.Filme;
import com.ada.imdb.model.ator.Ator;
import com.ada.imdb.model.diretor.Diretor;

import java.time.Duration;
import java.util.List;

public record FilmeDTO(String titulo, List<String> genero, Duration duracao, int ano,
                    String classificacao, double nota, String sinopse) {

    public Filme toFilme() {
        return Filme.builder().titulo(titulo).genero(genero).duracao(duracao).ano(ano).classificacao(classificacao).nota(nota).sinopse(sinopse).build();
    }

}
