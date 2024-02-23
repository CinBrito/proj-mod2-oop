package com.ada.imdb.dto;

import com.ada.imdb.model.diretor.Diretor;

import java.time.LocalDate;

public record DiretorDTO(String nome, String paisOrigem, LocalDate dataNascimento) {

    public Diretor toDiretor() {
        return Diretor.builder().nome(nome).paisOrigem(paisOrigem).dataNascimento(dataNascimento).build();
    }
}
