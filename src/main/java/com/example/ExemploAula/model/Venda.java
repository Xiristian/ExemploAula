package com.example.ExemploAula.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda extends EntityId implements OperacaoFinanceira {
    private LocalDate dataVenda;
    private Cliente cliente;
    private FormaPagamento formaPagamento;
    private String observacao;
    private List<ItemVenda> itens = new ArrayList<>();

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void addItemVenda(ItemVenda item){
        this.itens.add(item);
    }

    public void delItemVenda(ItemVenda item){
        this.itens.remove(item);
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public LocalDate getDataOperacao() {
        return this.getDataVenda();
    }

    @Override
    public Double getValorTotalOperacao() {
        return this.getItens().stream()
                .mapToDouble(ItemVenda::getValorCalculado)
                .sum();
    }

    @Override
    public TipoOperacao getTipoOperacao() {
        return TipoOperacao.CREDITO;
    }
}
