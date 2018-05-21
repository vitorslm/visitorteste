package br.com.vmukai;

import javafx.beans.binding.StringExpression;

public class Produto {

    private String nome;
    private double preco;
    private double freteChina;
    private double freteEuropa;
    private double freteEua;

    public Produto(String nome, double preco, double freteChina, double freteEuropa, double freteEua) {
        this.nome = nome;
        this.preco = preco;
        this.freteChina = freteChina;
        this.freteEuropa = freteEuropa;
        this.freteEua = freteEua;
    }

    public Object accept(Visitor visitor){
        return visitor.visit(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getFreteChina() {
        return freteChina;
    }

    public void setFreteChina(double freteChina) {
        this.freteChina = freteChina;
    }

    public double getFreteEuropa() {
        return freteEuropa;
    }

    public void setFreteEuropa(double freteEuropa) {
        this.freteEuropa = freteEuropa;
    }

    public double getFreteEua() {
        return freteEua;
    }

    public void setFreteEua(double freteEua) {
        this.freteEua = freteEua;
    }
}
