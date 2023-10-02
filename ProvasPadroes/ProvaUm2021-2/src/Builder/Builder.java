package Builder;

import Produtos.Disciplina;
import Produtos.Livro;

public interface Builder {
    public void addLivro(Livro livro);

    public void addDisciplina(Disciplina disciplina);

    public void addNomeCurso(String nome);

    public void addCodicoCurso(String codigo);

    public void resetar();
}
