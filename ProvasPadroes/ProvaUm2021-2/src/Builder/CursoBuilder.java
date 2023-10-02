package Builder;

import Produtos.Curso;
import Produtos.Disciplina;
import Produtos.Livro;

public class CursoBuilder implements Builder {
    private Curso curso;

    public CursoBuilder() {
        this.resetar();
    }

    @Override
    public void addLivro(Livro livro) {
        curso.addLivro(livro);
    }

    @Override
    public void addDisciplina(Disciplina disciplina) {
        curso.addDisciplina(disciplina);
    }

    @Override
    public void addNomeCurso(String nome) {
        curso.setNome(nome);
    }

    @Override
    public void addCodicoCurso(String codigo) {
        curso.setCodigo(codigo);
    }

    @Override
    public void resetar() {
        curso = new Curso(null, null);
    }

    public Curso criaCurso() {
        Curso cursoClone = this.curso;
        curso = new Curso(null, null);
        return cursoClone;
    }

}
