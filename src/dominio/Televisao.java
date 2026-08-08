package dominio;

public class Televisao extends Produto{
    private static final String TIPO = "TELEVISÃO";
    private int tamanhoPolegadas;
    private String resolucao;
    private Boolean smartTv;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public String toString() {
        String saida = Televisao.TIPO + "\n";
        saida += super.toString();

        if (this.tamanhoPolegadas != 0) {
            saida += "\nTamanho: " + this.tamanhoPolegadas + "\"";
        }

        if (this.resolucao != null) {
            saida += "\nResolução: " + this.resolucao;
        }

        if (this.smartTv != null) {
            saida += "\nÉ uma SmarTv: ";

            if (this.smartTv) {
                saida += "Sim";
            } else {
                saida += "Não";
            }
        }
    
        return saida;
    }

    @Override
    public double imposto() {
        return getValor() * 0.2;
    }

    public static String getTipo() {
        return TIPO;
    }

    public int getTamanhoPolegadas() {
        return tamanhoPolegadas;
    }

    public void setTamanhoPolegadas(int tamanhoPolegadas) {
        this.tamanhoPolegadas = tamanhoPolegadas;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public boolean isSmartTv() {
        return smartTv;
    }

    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }
}
