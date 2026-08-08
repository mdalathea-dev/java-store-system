package dominio;

public class Headset extends Produto {
    private static final String TIPO = "HEADSET";
    private String tipoConexao;
    private boolean temMicrofone;

    public Headset(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public String toString() {
        String saida = Headset.TIPO + "\n";
        saida += super.toString();
        
        if (this.tipoConexao != null) {
            saida += "\nTipo de conexão: " + this.tipoConexao;
        }

        if (this.temMicrofone) {
            saida += "\nPossui microfone: ";

            if (this.temMicrofone == true) {
                saida += "Sim";
            } else {
                saida += "Não";
            }
        }

        return saida;
    }

    @Override
    public double imposto() {
        return getValor() * 0.1;
    }

    public static String getTipo() {
        return TIPO;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public boolean isTemMicrofone() {
        return temMicrofone;
    }

    public void setTemMicrofone(boolean temMicrofone) {
        this.temMicrofone = temMicrofone;
    }
}
