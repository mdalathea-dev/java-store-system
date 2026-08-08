package service;

import dominio.Produto;

public class Loja {
    private Produto[] cadastrados;

    public static void linhaFina() {
        System.out.println("-------------------------");
    }

    public static void linhaGrossa() {
        System.out.println("=========================");
    }

    public Loja(Produto[] cadastrados) {
        this.cadastrados = cadastrados;
    }

    public double valorTotal() {
        double soma = 0;
        
        for (Produto produto : this.cadastrados) {
            soma += produto.getValor();
        }
        
        return soma;
    }

    public void imprimeProdutos() {
        System.out.println("PRODUTOS CADASTRADOS");
        Loja.linhaGrossa();
        
        for (int i=0; i < this.cadastrados.length; i++) {
            System.out.println(this.cadastrados[i]);
            if (cadastrados.length - i != 1) {
                linhaFina();
            } else {
                linhaGrossa();
            }
        }
    }

    public void buscarPorNome(String nomeProduto) {
        int cont = 0;
        
        for (Produto produto : this.cadastrados) {
            if (produto.getNome().equals(nomeProduto)) {
                System.out.println("Produto encontrado:");
                System.out.println(produto);
                cont = 1;
            } 
        }
        
        if (cont == 0) {
            System.out.printf("Produto \"%s\" não encontrado\n", nomeProduto);
        }

        linhaGrossa();
    }

    public Produto[] getCadastrados() {
        return cadastrados;
    }

    public void setCadastrados(Produto[] cadastrados) {
        this.cadastrados = cadastrados;
    }
}

