package service;

import dominio.Produto;

public class Loja {
    private Produto[] cadastrados;

    public Loja(Produto[] cadastrados) {
        this.cadastrados = cadastrados;
    }

    public void valorTotal() {
        double soma = 0;
        
        for (Produto produto : this.cadastrados) {
            soma += produto.getValor();
        }
        
        System.out.println("Valor Total: R$" + soma);
    }

    public void imprimeProdutos() {
        System.out.println("PRODUTOS CADASTRADOS");
        System.out.println("=========================");
        
        for (Produto produto : this.cadastrados) {
            System.out.print(produto);
            System.out.println("\n-------------------------");
        }
    }

    public void buscarPorNome(String nomeProduto) {
        int cont = 0;
        
        for (Produto produto : this.cadastrados) {
            if (produto.getNome().equals(nomeProduto)) {
                System.out.println("Produto encontrado:");
                System.out.println(produto);
                System.out.println("-------------------------");
                cont = 1;
            } 

            if (cont == 1) {
                System.out.printf("Produto \"%s\" não encontrado\n", nomeProduto);
            }
        }
    }

    public Produto[] getCadastrados() {
        return cadastrados;
    }

    public void setCadastrados(Produto[] cadastrados) {
        this.cadastrados = cadastrados;
    }
}

