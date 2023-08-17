package org.example.model;

public class Fornecedor extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;

    public Fornecedor() {
    }

    public Fornecedor(Long id, String nome, String telefone, String endereco, String email, String cnpj, String inscricaoEstadual) {
        super(id, nome, telefone, endereco, email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
}
