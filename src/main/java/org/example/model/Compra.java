package org.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compra extends EntityId implements OperacaoFinanceira{
    private LocalDate dataCompra;
    private Fornecedor fornecedor;
    private String observacao;
    private List<ItemCompra> itens = new ArrayList<>();

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<ItemCompra> getItens() {
        return itens;
    }

    public void setItens(List<ItemCompra> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "dataCompra=" + dataCompra +
                ", fornecedor=" + fornecedor +
                ", observacao='" + observacao + '\'' +
                ", itens=" + itens +
                '}';
    }

    @Override
    public LocalDate getDataOperacao() {
        return this.getDataCompra();
    }

    @Override
    public Double getValorTotalOperacao() {
        return this.getItens().stream()
                .mapToDouble(ItemCompra::getValorUnitario)
                .sum();
    }

    @Override
    public TipOperacao getTipoOperacao() {
        return TipOperacao.DEBITO;
    }
}