package Builder;

import Produtos.Disciplina;
import Produtos.Ementa;
import Produtos.Livro;

public class EmentaBuilder implements Builder {
    private Ementa ementa;

    public EmentaBuilder() {
        this.resetar();
    }

    @Override
    public void addLivro(Livro livro) {
        ementa.addLivro(livro);
    }

    @Override
    public void addDisciplina(Disciplina disciplina) {
        ementa.addDisciplina(disciplina);
    }

    @Override
    public void addNomeCurso(String nome) {
        ementa.setNomeCurso(nome);
    }

    @Override
    public void addCodicoCurso(String codigo) {
        ementa.setCodCurso(codigo);
    }

    @Override
    public void resetar() {
        ementa = new Ementa(null, null);
    }

    public Ementa getEmenta() {
        Ementa ementaClone = this.ementa;
        this.resetar();
        return ementaClone;
    }
}
