package com.example.ExemploAula.health;

import com.example.ExemploAula.model.*;
import com.example.ExemploAula.repostory.ClienteRepository;
import com.example.ExemploAula.repostory.ProdutoRepository;
import com.example.ExemploAula.repostory.ServicoRepository;
import com.example.ExemploAula.repostory.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.ClientEndpoint;
import java.time.LocalDate;

@RestController
public class HealthCheckController {
    @Autowired
    public ProdutoRepository produtoRepository;
    @Autowired
    public ServicoRepository servicoRepository;
    @Autowired
    public ClienteRepository clienteRepository;
    @Autowired
    public VendaRepository vendaRepository;

    @GetMapping("/health")
    public String healthCheck() {
        return "OK👍";
    }

    @GetMapping("/teste")
    public String healthCheck2() {
        Produto produto = new Produto();
        produto.setDescricao("TESTE TESTE");
        produto.setNome("TESTE");
        produto.setValorUnitario(1000.00);
        produto.setDataPrazo(LocalDate.now());
        produto.setDataValidade(LocalDate.now());
        produto.setPrecoCompra(850.00);
        produto.setStatus(Status.DISPONIVEL);
        produto.setEstocavel(Boolean.TRUE);

        produtoRepository.save(produto);

        Servico servico = new Servico();
        servico.setQuantidadeHoras(20.00);
        servico.setDescricao("Instalação Teste");
        servico.setEstocavel(Boolean.TRUE);
        servico.setValorUnitario(150.00);

        servico = servicoRepository.save(servico);

        Cliente cliente = new Cliente("Xis","489995555555", "Rua dos Bobos",
                                "xis@gmal.com", "123456789-80", "123456789");

        cliente = clienteRepository.save(cliente);

        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setDataVenda(LocalDate.now());
        venda.setObservacao("Teste");
        venda.setFormaPagamento(FormaPagamento.A_VISTA);

        ItemVenda itemVenda = new ItemVenda(produto, 1000.00, 1.0, 10.00);
        ItemVenda itemVenda2 = new ItemVenda(servico, 120.00, 1.0, 10.00);

        venda.addItemVenda(itemVenda);
        venda.addItemVenda(itemVenda2);

        vendaRepository.save(venda);

        return "Comando Executado! " + venda.getId();
    }
}
