package produto;

public class Acessorio extends Equipamento{
    public String descricao;

    public Acessorio(String identificador,int quantidade) {
    super(identificador);
    super.mudarQuantidade(quantidade);
    }

    public String getDescricao() {
        return descricao;
    }
}
