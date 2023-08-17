package org.example.model;

import java.time.LocalDate;

public class Produto extends EntityId {
    private String nome;
    private String descricao;
    private Double precoCompra;
    private Double precoVenda;
    private LocalDate dataValidade;
    private LocalDate dataPrazo;
    private Status status;

    public Produto() {
    }

    public Produto(Long id, String nome, String descricao, Double precoCompra, Double precoVenda, LocalDate dataValidade, LocalDate dataPrazo, Status status) {
        super(id);
        this.nome = nome;
        this.descricao = descricao;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.dataValidade = dataValidade;
        this.dataPrazo = dataPrazo;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(Double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
        if (this.calculaMargemDeLucro() < 20.0){
            System.out.println("A margem de lucro deve ser sempre maior ou igual a 20%");
        }
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataPrazo() {
        return dataPrazo;
    }

    public void setDataPrazo(LocalDate dataPrazo) {
        this.dataPrazo = dataPrazo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Double calculaMargemDeLucro(){
        double lucro = precoVenda - precoCompra;
        double margemLucro = (lucro/precoVenda) * 100;
        return margemLucro;
    }
}
