package builderpreparo;

import produtos.Alimento;

public interface Builder {
    public void setNome(String nome);

    public void setLowCarb();

    public void setVegano();

    public void setLactose();

    public void setGluten();

    public void setSodio();

    public void modoDeFazer(String modo);

    public void resetar();

    public void adicionarAlimentos(Alimento alimento);
}
