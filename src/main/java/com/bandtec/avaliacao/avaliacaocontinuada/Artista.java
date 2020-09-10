package com.bandtec.avaliacao.avaliacaocontinuada;

public abstract class Artista {

    private String nome;

    public Artista(String nome) {
        this.nome = nome;
    }

    public abstract Double vendaArte();

    @Override
    public String toString() {
        return "\nnome='" + nome + '\'';
    }

    public String getNome() {
        return nome;
    }
}
