package dominio;

public class Televisao extends Produto{

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double imposto() {
        return getValor() * 0.2;
    }
}
