package br.edu.unisep.despesas.model.view;

public class Despesas {

    private String descricao;
    private String valor;
    private String data;
    private Pessoa pessoa;

    public Despesas(String descricao, String valor, String data, Pessoa pessoa) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.pessoa = pessoa;
    }

    public Despesas() {

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }


    @Override
    public String toString() {
        return "~~DESPESAS~~ \n" +
                "Descrição: " + descricao + "\n" +
                "Data: " + data + "\n" +
                "Valor: " + valor + "\n" +
                "Pessoa: " + pessoa + "\n";
    }
    }
