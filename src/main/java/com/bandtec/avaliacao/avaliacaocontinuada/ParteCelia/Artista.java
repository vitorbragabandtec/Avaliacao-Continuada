package com.bandtec.avaliacao.avaliacaocontinuada.ParteCelia;

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
}
