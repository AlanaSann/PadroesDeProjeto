package factoryMethod;

import produto.Equipamento;
import produto.Maquina;

public class MaquinaFabrica extends EquipamentoFabrica{

    @Override
    public Equipamento criaEquipamento(String identificador, int quantidade) {
        return new Maquina(identificador, quantidade);
    }

    
}
