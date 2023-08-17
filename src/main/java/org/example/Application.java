package org.example;

import org.example.model.Cliente;
import org.example.model.FormaPagamento;
import org.example.model.Fornecedor;
import org.example.model.Venda;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Fornecedor dell = new Fornecedor();
        dell.setNome("Dell LTDA");
        dell.setCnpj("045802000188");
        dell.setInscricaoEstadual("456411321");
        dell.setEmail("comercial@dell.com.br");
        dell.setTelefone("48 999998585");
        dell.setEndereco("Rua Joaquim XXII");

        Cliente bruno = new Cliente();
        bruno.setNome("Bruno Kurzawe");
        bruno.setCpf("04685825233");
        bruno.setRg("5229814");
        bruno.setEmail("bruno.kurzawe@betha.com.br");
        bruno.setTelefone("48 999089410");
        bruno.setEndereco("Rua Almirante B");

        Venda venda01 = new Venda();
        venda01.setId(10L);
        venda01.setDataVenda(LocalDate.of(2023, 1, 1));
        venda01.setCliente(bruno);
        venda01.setFormaPagamento(FormaPagamento.A_VISTA);
        venda01.setObservacao("Observação 01");
    }
}

