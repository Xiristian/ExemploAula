
package org.example;

import org.example.model.Produto;
import org.example.model.Status;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Produto 1");
        produto.setDescricao("Descrição Produto 1");
        produto.setDataPrazo(LocalDate.of(2023,01,15));
        produto.setPrecoCompra(1200.00);
        produto.setPrecoVenda(1400.00);
        produto.setStatus(Status.DISPONIVEL);


        System.out.println("Margem: " + produto.calculaMargemDeLucro() + "%");
    }
}

