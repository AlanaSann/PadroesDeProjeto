package builder;

import produto.Categoria;
import produto.Equipamento;

public interface ExercicioBuilder {
    public void resetar();

    public void setNome(String nome);

    public void setCategoria(Categoria categoria);

    public void setMusculares(String musculo);

    public void setEquipamentos(Equipamento equipamento);
}
