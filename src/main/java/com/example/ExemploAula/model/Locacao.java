package com.example.ExemploAula.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Locacao extends EntityId implements OperacaoFinanceira{
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;
    private Cliente cliente;
    private String endereco;
    private String observacao;
    private List<ItemLocacao> itens = new ArrayList<>();

    public void addItemLocacao(ItemLocacao item){
        this.itens.add(item);
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<ItemLocacao> getItens() {
        return itens;
    }

    public void setItens(List<ItemLocacao> itens) {
        this.itens = itens;
    }



    @Override
    public String toString() {
        return "Locacao{" +
                "dataLocacao=" + dataLocacao +
                ", dataDevolucao=" + dataDevolucao +
                ", cliente=" + cliente +
                ", endereco='" + endereco + '\'' +
                ", observacao='" + observacao + '\'' +
                ", itens=" + itens +
                '}';
    }

    @Override
    public LocalDate getDataOperacao() {
        return this.getDataLocacao();
    }

    @Override
    public Double getValorTotalOperacao() {
        return this.getItens().stream()
                .mapToDouble(ItemLocacao::getValorCalculado)
                .sum();
    }

    @Override
    public TipoOperacao getTipoOperacao() {
        return TipoOperacao.CREDITO;
    }
}