package dominio;

public class Headset extends Produto {

    public Headset(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double imposto() {
        return getValor() * 0.1;
    }
}
