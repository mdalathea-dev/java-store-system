package service;

import dominio.Produto;

public class Loja {
    private Produto[] cadastrados;

    public Loja(Produto[] cadastrados) {
        this.cadastrados = cadastrados;
    }

    public void imprimeProdutos() {
        System.out.println("PRODUTOS CADASTRADOS");
        Linha.linhaGrossa();
        
        for (int i=0; i < this.cadastrados.length; i++) {
            System.out.println(this.cadastrados[i]);
            if (cadastrados.length - i != 1) {
                Linha.linhaFina();
            } else {
                Linha.linhaGrossa();
            }
        }
    }

    public void buscarPorNome(String nomeProduto) {
        int cont = 0;
        
        for (Produto produto : this.cadastrados) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                System.out.println("Produto encontrado:");
                System.out.println(produto);
                cont = 1;
            } 
        }
        
        if (cont == 0) {
            System.out.printf("Produto \"%s\" não encontrado\n", nomeProduto);
        }

        Linha.linhaGrossa();
    }

    public void RemoverPorNome(String nomeProduto) {
        int cont = 0;
        
        for (int i=0; i < cadastrados.length; i++) {
            if (cadastrados[i].getNome().equalsIgnoreCase(nomeProduto)) {
                cadastrados[i] = null;
                System.out.println("Produto removido com sucesso");
                cont = 1;
            }
        }

        if (cont == 0) {
            System.out.printf("Produto \"%s\" nunca esteve cadastrado\n", nomeProduto);
        }

        Linha.linhaGrossa();
    }

    public Produto produtoMaisCaro() {
        Produto maisCaro = cadastrados[0];
        for (int i=0; i < cadastrados.length; i++) {
            if (maisCaro.getValor() < cadastrados[i].getValor()) {
                    maisCaro = cadastrados[i];
                }
            }
        
            return maisCaro;
        }

    public Produto produtoMaisBarato() {
        Produto maisBarato = cadastrados[0];
        for (int i=0; i < cadastrados.length; i++) {
            if (maisBarato.getValor() > cadastrados[i].getValor()) {
                    maisBarato = cadastrados[i];
                }
            }
        
            return maisBarato;
        }

    public double valorTotal() {
        double soma = 0;
        
        for (Produto produto : this.cadastrados) {
            soma += produto.getValor();
        }
        
        return soma;
    }

    public Produto[] getCadastrados() {
        return cadastrados;
    }

    public void setCadastrados(Produto[] cadastrados) {
        this.cadastrados = cadastrados;
    }
}

