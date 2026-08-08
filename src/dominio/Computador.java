package dominio;

public class Computador extends Produto{
    private static final String TIPO = "COMPUTADOR";
    private String processador;
    private int memoriaRam;
    private int armazenamento;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public String toString() {
        String saida = Computador.TIPO + "\n";
        saida += super.toString();

        if (this.processador != null) {
            saida += "\nProcessador: " + this.processador;
        }
        
        if (this.memoriaRam != 0) {
            saida += "\nMemória Ram: " + this.memoriaRam + "GB";
        }
        
        if (this.armazenamento != 0) {
            saida += "\nArmazenamento: " + this.armazenamento;
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

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
}
