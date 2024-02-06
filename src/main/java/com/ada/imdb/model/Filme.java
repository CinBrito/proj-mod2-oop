package com.ada.imdb.model;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private String genero;
    private String ano;
    private String classificacao;
    private double nota;
    private String sinopse;
    List<Ator> atores = new ArrayList<>();
    List<Diretor> diretores = new ArrayList<>();
}
