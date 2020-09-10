package com.bandtec.avaliacao.avaliacaocontinuada;

public class Escultor extends Artista {

    private Double tempoTrabalho;
    private Double valorHora;
    private Double valorMaterial;
    private String especializacao;


    public Escultor(String nome, Double tempoTrabalho, Double valorHora, Double valorMaterial,String especializacao) {
        super(nome);
        this.tempoTrabalho = tempoTrabalho;
        this.valorHora = valorHora;
        this.valorMaterial = valorMaterial;
        this.especializacao = especializacao;
    }

    public Double getTempoTrabalho() {
        return tempoTrabalho;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public Double getValorMaterial() {
        return valorMaterial;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    @Override
    public Double vendaArte() {
        return valorHora * tempoTrabalho + valorMaterial;
    }

    @Override
    public String toString() {
        return " \nEscultor :" +
                "\ntempoTrabalho=" + tempoTrabalho +
                "\nvalorHora=" + valorHora +
                "\nvalor do Material="+ valorMaterial +
                "\nespecializacao='" + especializacao +
                "\nvalor da venda=" + vendaArte() + '\'' +
                 super.toString();
    }

}
