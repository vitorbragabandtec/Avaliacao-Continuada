package com.bandtec.avaliacao.avaliacaocontinuada.ParteCelia;

public class Animador extends Artista {

    private Double tempoTrabalho;
    private Double valorHora;
    private String especializacao;

    public Animador(String nome, Double tempoTrabalho, Double valorHora, String especializacao) {
        super(nome);
        this.tempoTrabalho = tempoTrabalho;
        this.valorHora = valorHora;
        this.especializacao = especializacao;
    }

    @Override
    public Double vendaArte() {
        return valorHora * tempoTrabalho;
    }

    @Override
    public String toString() {
        return "\nAnimador: " +
                "\ntempoTrabalho=" + tempoTrabalho +
                "\nvalorHora=" + valorHora +
                "\nespecializacao='" + especializacao +
                "\nvalor da venda=" + vendaArte() + '\'' +
                 super.toString();
    }
}
