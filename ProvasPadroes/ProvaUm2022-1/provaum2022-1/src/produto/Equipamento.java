package produto;
public abstract class Equipamento {
    private String identificador;
    private int quantidade;

    public Equipamento(String identificador) {
        this.identificador = identificador;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getIdentificador() {
        return identificador;
    }
    
    public void mudarQuantidade (int valor){
        this.quantidade += valor;
    }

}
