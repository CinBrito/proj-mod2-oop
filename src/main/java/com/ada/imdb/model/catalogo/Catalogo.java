package com.ada.imdb.model.catalogo;

import com.ada.imdb.model.ator.Ator;
import com.ada.imdb.model.diretor.Diretor;
import com.ada.imdb.model.filme.Filme;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    /**
     *  A classe Catalogo é responsável por armazenar os dados de filmes, atores e diretores.
     *  Cada uma das listas contém os objetos do tipo Filme, Ator e Diretor.
     *  A classe possui um construtor privado para que a instância seja criada somente uma vez, aplicando o design pattern Singleton.
     *  Evitamos o uso da classe Catalogo em camadas que não seja do tipo Repository.
    * */

    private static Catalogo catalogo;

    private final List<Filme> filmes = new ArrayList<>();
    private final List<Ator> atores = new ArrayList<>();
    private final List<Diretor> diretores = new ArrayList<>();

    private Catalogo() {}

    public static synchronized Catalogo getInstance() {
        if (catalogo == null) {
            catalogo = new Catalogo();
        }

        return catalogo;
    }

    public List<Filme> getFilmes() {
        return this.filmes;
    }

    public List<Ator> getAtores() {
        return this.atores;
    }

    public List<Diretor> getDiretores() {
        return this.diretores;
    }
}
