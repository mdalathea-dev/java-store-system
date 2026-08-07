package dominio;

public class Mouse extends Produto {

    public Mouse(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double imposto() {
        return getValor() * 0.12;
    }
    
    
}
