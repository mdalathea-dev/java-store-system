package application;

import dominio.Produto;
import dominio.Celular;
import dominio.Computador;
import dominio.Headset;
import dominio.Mouse;
import dominio.Televisao;
import service.Linha;
import service.Loja;

public class StoreTest {
    public static void main(String[] args) {
        Celular celular = new Celular("Samsung Galaxy A55", 1900);
        celular.setMarca("Samsung");
        celular.setArmazenamento(256);
        celular.setMemoriaRam(8);

        Computador computador = new Computador("Lenovo IdeaPad 1", 2700);
        computador.setMarca("Lenovo");
        computador.setProcessador("Intel Core i5");
        computador.setMemoriaRam(16);
        computador.setArmazenamento(512);

        Headset headset = new Headset("HyperX Cloud Stinger II", 250);
        headset.setMarca("HyperX");
        headset.setTemMicrofone(true);

        Mouse mouse = new Mouse("Logitech G502", 350);
        mouse.setMarca("Logitech");
        mouse.setDpi(25600);

        Televisao televisao = new Televisao("Smart TV LG OLED", 4500);
        televisao.setMarca("LG");
        televisao.setTamanhoPolegadas(55);
        televisao.setSmartTv(true);

        Loja loja = new Loja(new Produto[]{celular, computador, headset, mouse, televisao});

        System.out.println("Calculando imposto sobre os Produtos...");
        System.out.println();
        for (Produto produto : loja.getCadastrados()) {
            produto.setImposto(produto.imposto());
        }

        loja.imprimeProdutos();

        System.out.println("Valor total dos produtos: R$" + loja.valorTotal());
        Linha.linhaGrossa();

        loja.buscarPorNome("Samsung Galaxy A55");
        loja.buscarPorNome("Nitro 5");

        System.out.println("Produto mais caro:");
        System.out.println(loja.produtoMaisCaro());
        Linha.linhaGrossa();

        System.out.println("Produto mais barato:");
        System.out.println(loja.produtoMaisBarato());
        Linha.linhaGrossa();

        // erro em RemoverPorNome devido a limitação do uso de array em vez de collections, arrumarei futuramente

        loja.RemoverPorNome("Samsung Galaxy A55");
        
        loja.imprimeProdutos();

        System.out.println("Produto mais barato:");
        System.out.println(loja.produtoMaisBarato());
        Linha.linhaGrossa();
    }
}
