package produtos;

public class Nutrientes {
    private String nome;
    private int unidade;
    private int caloriaPorUnidade;

    public Nutrientes(String nome) {
        this.nome = nome;
        this.unidade = 0;
        this.caloriaPorUnidade = 0;
    }

    public Nutrientes(String nome, int unidade, int caloriaPorUnidade) {
        this.nome = nome;
        this.unidade = unidade;
        this.caloriaPorUnidade = caloriaPorUnidade;
    }

    public String getNome() {
        return nome;
    }

    public int getUnidade() {
        return unidade;
    }

    public int getCaloriaPorUnidade() {
        return caloriaPorUnidade;
    }

}
