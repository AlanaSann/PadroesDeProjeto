package builder;

import java.util.ArrayList;
import java.util.List;

import produto.Categoria;
import produto.Equipamento;
import produto.Exercicio;

public class ExercicioConcretoBuilder implements ExercicioBuilder {
    private List<String> listMusculos;
    private String nome;
    private List<Categoria> listCategorias;
    private List<Equipamento> listEquipamentos;

    public ExercicioConcretoBuilder() {
        this.nome = null;
        this.listCategorias = new ArrayList<Categoria>();
        this.listEquipamentos = new ArrayList<Equipamento>();
        this.listMusculos = new ArrayList<String>();
    }

    @Override
    public void resetar() {
        this.nome = null;
        this.listCategorias = new ArrayList<Categoria>();
        this.listEquipamentos = new ArrayList<Equipamento>();
        this.listMusculos = new ArrayList<String>();
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setCategoria(Categoria categoria) {
        this.listCategorias.add(categoria);
    }

    @Override
    public void setMusculares(String musculo) {
        this.listMusculos.add(musculo);
    }

    @Override
    public void setEquipamentos(Equipamento equipamento) {
        this.listEquipamentos.add(equipamento);
    }

    public Exercicio criarExercicio(String nome) {
        Exercicio exercicio = new Exercicio(listMusculos, nome, listCategorias, listEquipamentos);
        resetar();
        return exercicio;
    }
}
