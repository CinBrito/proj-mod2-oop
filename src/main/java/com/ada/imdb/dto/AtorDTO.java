package com.ada.imdb.dto;

import com.ada.imdb.model.ator.Ator;

import java.time.LocalDate;

public record AtorDTO(String nome, String paisOrigem, LocalDate dataNascimento) {

    public Ator toAtor() {
        return Ator.builder().nome(nome).paisOrigem(paisOrigem).dataNascimento(dataNascimento).build();
    }
}
