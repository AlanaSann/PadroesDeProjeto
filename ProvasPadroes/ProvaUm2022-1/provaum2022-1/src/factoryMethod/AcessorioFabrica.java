package factoryMethod;

import produto.Acessorio;
import produto.Equipamento;

public class AcessorioFabrica extends EquipamentoFabrica{

    @Override
    public Equipamento criaEquipamento(String identificador, int quantidade) {
        return new Acessorio(identificador,quantidade);
    }
    
}
