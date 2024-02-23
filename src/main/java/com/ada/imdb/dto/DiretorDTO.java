package com.ada.imdb.dto;

import com.ada.imdb.model.diretor.Diretor;

import java.time.LocalDate;

public record DiretorDTO(int idDiretor, String nome, String paisOrigem, LocalDate dataNascimento) {

    public Diretor toDiretor() {
        return Diretor.builder().idDiretor(idDiretor).nome(nome).paisOrigem(paisOrigem).dataNascimento(dataNascimento).build();
    }
}
