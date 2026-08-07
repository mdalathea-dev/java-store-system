package dominio;

import interfaces.Taxavel;

public abstract class Produto implements Taxavel{
    private String nome;
    private double valor;
    private String marca;
    
    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        String saida = "Nome: " + this.nome + "\nPreço: " + this.valor;

        if (this.marca != null) {
            saida += "\nMarca: " + this.marca;
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
}
