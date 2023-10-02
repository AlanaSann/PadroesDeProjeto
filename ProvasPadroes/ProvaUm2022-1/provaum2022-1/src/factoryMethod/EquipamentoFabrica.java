package factoryMethod;

import produto.Equipamento;

public abstract class  EquipamentoFabrica {
    public abstract Equipamento criaEquipamento (String identificador,int quantidade);
}
