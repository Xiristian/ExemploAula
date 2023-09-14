package com.example.ExemploAula.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa {
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "rg")
    private String rg;

    @Override
    public String getDocumentoPrincipal() {
        return this.getCpf();
    }

    public Cliente() {
    }

    public Cliente(String nome, String telefone, String endereco, String email, String cpf, String rg) {
        super(nome, telefone, endereco, email);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                '}';
    }
}
