package produto;

import java.util.List;

public class Exercicio {
    private List<String> listMusculos;
    private String nome;
    private List<Categoria> listCategorias;
    private List<Equipamento> listEquipamentos;

    public Exercicio(List<String> listMusculos, String nome, List<Categoria> listCategorias,
            List<Equipamento> listEquipamentos) {
        this.listMusculos = listMusculos;
        this.nome = nome;
        this.listCategorias = listCategorias;
        this.listEquipamentos = listEquipamentos;
    }

    public List<String> getListMusculos() {
        return listMusculos;
    }

    public String getNome() {
        return nome;
    }

    public List<Categoria> getListCategorias() {
        return listCategorias;
    }

    public List<Equipamento> getListEquipamentos() {
        return listEquipamentos;
    }

    @Override
    public String toString() {
        return "Exercicio [listMusculos=" + listMusculos + ", nome=" + nome + ", listCategorias=" + listCategorias
                + ", listEquipamentos=" + listEquipamentos + "]";
    }

}
