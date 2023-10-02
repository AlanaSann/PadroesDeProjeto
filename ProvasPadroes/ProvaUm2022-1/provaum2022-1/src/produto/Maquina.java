package produto;

public class Maquina extends Equipamento{
    public String descricao;
    public String marca;

    public Maquina(String identificador,int quantidade) {
        super(identificador);
        super.mudarQuantidade(quantidade);
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMarca() {
        return marca;
    }
    
    
}
