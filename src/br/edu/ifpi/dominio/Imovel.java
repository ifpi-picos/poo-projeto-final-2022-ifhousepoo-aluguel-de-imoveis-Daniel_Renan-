package br.edu.ifpi.dominio;
import java.time.LocalDate;

public class Imovel {
    private String descricao;
    private double valorAluguel;
    private Endereco enderecoCompleto;
    private LocalDate dataCadastro;
    
    public Imovel(String descricao, double valorAluguel, Endereco enderecoCompleto, LocalDate dataCadastro) {
        this.descricao = descricao;
        this.valorAluguel = valorAluguel;
        this.enderecoCompleto = enderecoCompleto;
        this.dataCadastro = dataCadastro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public Endereco getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public void setEnderecoCompleto(Endereco enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Imovel [descricao=" + descricao + ", valorAluguel=" + valorAluguel + ", enderecoCompleto="
                + enderecoCompleto + ", dataCadastro=" + dataCadastro + "]";
    }
}
