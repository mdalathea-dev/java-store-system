package dominio;

public class Computador extends Produto{

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double imposto() {
        return getValor() * 0.2;
    }
}
