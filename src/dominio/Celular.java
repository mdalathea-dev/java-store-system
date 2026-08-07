package dominio;

public class Celular extends Produto{

    public Celular(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double imposto() {
        return getValor() * 0.15;
    }

}
