package singleton;

import java.util.HashMap;
import java.util.Map;

import factoryMethod.AcessorioFabrica;
import factoryMethod.EquipamentoFabrica;
import factoryMethod.HalterFabrica;
import factoryMethod.MaquinaFabrica;
import produto.Equipamento;

public class Singleton {
    private static Singleton singleton;
    private Map<String, Equipamento> mapEquipamentos;
    private Map<String, EquipamentoFabrica> mapFabricaEquipamentos;

    private Singleton() {
        this.mapFabricaEquipamentos = new HashMap<String, EquipamentoFabrica>();
        this.mapEquipamentos = new HashMap<String, Equipamento>();
        this.mapFabricaEquipamentos.put("AcessorioFabrica", new AcessorioFabrica());
        this.mapFabricaEquipamentos.put("MaquinaFabrica", new MaquinaFabrica());
        this.mapFabricaEquipamentos.put("HalterFabrica", new HalterFabrica());
    }

    public static Singleton criarSingleton() {
        if (singleton == null) {
            Singleton.singleton = new Singleton();
        }
        return Singleton.singleton;
    }

    public Equipamento criarEquipamento(String identificador, int quantidade, String nomeFabrica) {
        Equipamento equipamento = jaExiste(identificador);
        EquipamentoFabrica fabrica = mapFabricaEquipamentos.get(nomeFabrica);
        if (equipamento != null) {
            equipamento.mudarQuantidade(quantidade);
            return equipamento;
        }
        equipamento = fabrica.criaEquipamento(identificador, quantidade);
        mapEquipamentos.put(identificador, equipamento);
        return equipamento;
    }

    public Equipamento jaExiste(String chave) {
        if (mapEquipamentos.containsKey(chave)) {
            return mapEquipamentos.get(chave);
        }
        return null;
    }
}