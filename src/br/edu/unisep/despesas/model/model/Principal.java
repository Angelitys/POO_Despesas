package br.edu.unisep.despesas.model.model;

import br.edu.unisep.despesas.model.view.Despesas;
import br.edu.unisep.despesas.model.view.Pessoa;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setId(1);
        pessoa.setNome("Angelo");
        pessoa.setCpf("777.666.666-67");
        pessoa.setIdade("Tem 18 anos");

        Despesas despesas = new Despesas();

        despesas.setDescricao("Fatura do cartão");
        despesas.setData("01/10/2024");
        despesas.setValor("R$ 244,77");
        despesas.setPessoa(pessoa);

        JOptionPane.showMessageDialog(null, despesas+ "\n" + pessoa.toString());
    }
}
