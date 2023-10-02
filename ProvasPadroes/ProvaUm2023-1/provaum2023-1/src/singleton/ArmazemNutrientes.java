package singleton;

import produtos.Nutrientes;

public interface ArmazemNutrientes {
    public Nutrientes criar(String nome, int unidade, int caloriaPorUnidade);

    public Nutrientes criar(String nome);
}
