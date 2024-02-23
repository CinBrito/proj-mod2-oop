package com.ada.imdb.dto;

import com.ada.imdb.model.ator.Ator;

import java.time.LocalDate;

public record AtorDTO(int idAtor, String nome, String paisOrigem, LocalDate dataNascimento) {

    public Ator toAtor() {
        return Ator.builder().idAtor(idAtor).nome(nome).paisOrigem(paisOrigem).dataNascimento(dataNascimento).build();
    }
}
