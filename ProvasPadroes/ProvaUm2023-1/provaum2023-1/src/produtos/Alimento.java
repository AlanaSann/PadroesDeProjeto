package produtos;

import java.util.HashMap;
import java.util.Map;

public class Alimento {
    private String nome;
    private Map<String, Nutrientes> MapNutrientes;
    private int quantidadesMacro;

    public Alimento(String nome) {
        this.nome = nome;
        this.MapNutrientes = new HashMap<String, Nutrientes>();
        this.quantidadesMacro = 0;
    }

    public String getNome() {
        return nome;
    }

    public Map<String, Nutrientes> getMapNutrientes() {
        return MapNutrientes;
    }

    public void adicionaNutrientes(Nutrientes nutriente) {
        MapNutrientes.put(nutriente.getNome(), nutriente);
        quantidadesMacro += nutriente.getUnidade();
    }

    public int quantidadesMacro() {
        return quantidadesMacro;
    }
}
