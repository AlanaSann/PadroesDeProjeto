package produtos;

import java.util.Map;

public class FichaNutricional {
    private int qtdeCarboidratos;
    private int qtdeProteinas;
    private int qtdeLipidios;
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FichaNutricional() {
        this.qtdeCarboidratos = 0;
        this.qtdeProteinas = 0;
        this.qtdeLipidios = 0;
    }

    public void adicionarAlimentos(Alimento alimento) {
        Map<String, Nutrientes> nutrientes = alimento.getMapNutrientes();

        for (Map.Entry<String, Nutrientes> nutriente : nutrientes.entrySet()) {
            if (nutriente.getKey().equals("carboidrato")) {
                this.qtdeCarboidratos += nutriente.getValue().getUnidade();
            }
            if (nutriente.getKey().equals("proteina")) {
                this.qtdeProteinas += nutriente.getValue().getUnidade();
            }
            if (nutriente.getKey().equals("lipidios")) {
                this.qtdeLipidios += nutriente.getValue().getUnidade();
            }
        }
    }

    @Override
    public String toString() {
        return "FichaNutricional [qtdeCarboidratos=" + qtdeCarboidratos + ", qtdeProteinas=" + qtdeProteinas
                + ", qtdeLipidios=" + qtdeLipidios + "]";
    }

}
