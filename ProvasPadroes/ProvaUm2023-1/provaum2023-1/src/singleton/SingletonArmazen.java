package singleton;

import java.util.HashMap;
import java.util.Map;

import produtos.Nutrientes;

public class SingletonArmazen implements ArmazemNutrientes {
    private static Map<String, Nutrientes> listNutrientes;
    private static SingletonArmazen armazen;

    public static SingletonArmazen criarArmazem() {
        if (SingletonArmazen.armazen != null) {
            return SingletonArmazen.armazen;
        }
        return SingletonArmazen.armazen = new SingletonArmazen();
    }

    private SingletonArmazen() {
        SingletonArmazen.listNutrientes = new HashMap<String, Nutrientes>();
    }

    @Override
    public Nutrientes criar(String nome, int unidade, int caloriaPorUnidade) {
        Nutrientes nutriente = this.jaExiste(nome);
        if (nutriente == null) {
            nutriente = new Nutrientes(nome, unidade, caloriaPorUnidade);
            listNutrientes.put(nome,nutriente);
        }
        return nutriente;
    }

    @Override
    public Nutrientes criar(String nome) {
        Nutrientes nutriente = this.jaExiste(nome);
        
        if (nutriente == null) {
            nutriente = new Nutrientes(nome);
            listNutrientes.put(nome,nutriente);
        }
        return nutriente;
    }

    public Nutrientes jaExiste(String chave) {
        if (listNutrientes.containsKey(chave)) {
            return listNutrientes.get(chave);
        }
        return null;
    }
}
