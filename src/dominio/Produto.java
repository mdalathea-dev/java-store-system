package dominio;

import interfaces.Taxavel;

public abstract class Produto implements Taxavel{
    private String nome;
    private double valor;
    private String marca;
    private double imposto;
    
    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        String saida = "Nome: " + this.nome + "\nPreço: R$" + this.valor;

        if (this.marca != null) {
            saida += "\nMarca: " + this.marca;
        }

        if (this.imposto != 0) {
            saida += "\nImposto: R$" + this.imposto;
        }

        return saida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double valorImposto) {
        this.imposto = valorImposto;
    }
}
