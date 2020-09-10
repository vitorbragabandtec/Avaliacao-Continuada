package com.bandtec.avaliacao.avaliacaocontinuada;

public class Cartunista extends Artista {

    private Double tempoTrabalho;
    private Integer qtdPaginas;
    private String especializacao;


    public Cartunista(String nome, Double tempoTrabalho, Integer qtdPaginas, String especializacao) {
        super(nome);
        this.tempoTrabalho = tempoTrabalho;
        this.qtdPaginas = qtdPaginas;
        this.especializacao = especializacao;
    }

    public Double getTempoTrabalho() {
        return tempoTrabalho;
    }

    public Integer getQtdPaginas() {
        return qtdPaginas;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    @Override
    public Double vendaArte() {
        return qtdPaginas * tempoTrabalho;
    }

    @Override
    public String toString() {
        return "\nCartunista:" +
                "\ntempoTrabalho=" + tempoTrabalho +
                "\nNumero de Paginas=" + qtdPaginas +
                "\nespecializacao='" + especializacao +
                "\nvalor da venda=" + vendaArte() + '\'' +
                 super.toString();
    }
}
