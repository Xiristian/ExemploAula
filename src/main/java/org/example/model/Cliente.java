package org.example.model;

public class Cliente extends Pessoa {
    private String cpf;
    private String rg;

    @Override
    public String getDocumentoPrincipal() {
        return this.getCpf();
    }

    public Cliente() {
    }

    public Cliente(Long id, String nome, String telefone, String endereco, String email, String cpf, String rg) {
        super(id, nome, telefone, endereco, email);
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
