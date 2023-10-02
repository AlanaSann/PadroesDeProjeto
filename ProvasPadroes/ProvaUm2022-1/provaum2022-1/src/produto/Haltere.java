package produto;

public class Haltere extends Equipamento{
    private double peso;

    public Haltere(String identificador,int quantidade) {
        super(identificador);
        super.mudarQuantidade(quantidade);
    }
    public double getPeso() {
        return peso;
    }
}
