package factoryMethod;

import produto.Equipamento;
import produto.Haltere;

public class HalterFabrica extends EquipamentoFabrica{

    @Override
    public Equipamento criaEquipamento(String identificador, int quantidade) {
        return new Haltere(identificador, quantidade);
    }
    
}
