package dominio;

public class Mouse extends Produto {
    private static final String TIPO = "MOUSE";
    private String tipoConexao;
    private int dpi;

    public Mouse(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public String toString() {
        String saida = Mouse.TIPO + "\n";
        saida += super.toString();

        if (this.tipoConexao != null) {
            saida += "\nTipo de conexão: " + this.tipoConexao;
        }

        if (this.dpi != 0) {
           saida += "\nDpi: " + this.dpi;
        }

        return saida;
    }

    @Override
    public double imposto() {
        return getValor() * 0.12;
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

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }
}
