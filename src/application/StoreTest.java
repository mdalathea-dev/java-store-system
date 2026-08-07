package application;

import dominio.Produto;
import dominio.Celular;
import dominio.Computador;
import dominio.Headset;
import dominio.Mouse;
import dominio.Televisao;
import service.Loja;

public class StoreTest {
    public static void main(String[] args) {
        Produto celular = new Celular("Sansung Galaxy A55", 1900);
        Computador computador = new Computador("Lenovo IdeaPad 1", 2700);
        Headset headset = new Headset("HyperX Cloud Stinger II", 250);
        Mouse mouse = new Mouse("Logitech G203 Lightsync", 140);
        Televisao televisao = new Televisao("Smart TV 55", 2400);

        celular.setMarca("Sansung");
        computador.setMarca("Lenovo");
        mouse.setMarca("Logitech");

        Loja loja = new Loja(new Produto[]{celular, computador, headset, mouse, televisao});

        System.out.println("Calculando imposto sobre os Produtos...");
        System.out.println();
        for (Produto produto : loja.getCadastrados()) {
            double imposto = produto.imposto();
            produto.setValor(produto.getValor() + imposto);
        }

        loja.imprimeProdutos();

        loja.valorTotal();

        loja.buscarPorNome("Smart TV 55");
    }
}
