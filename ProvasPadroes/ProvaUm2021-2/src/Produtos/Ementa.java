package Produtos;

public class Ementa {
    private String nomeCurso;
    private String codCurso;
    private String disciplinas;
    private int CH;
    private String livros;

    public Ementa(String nomeCurso, String codCurso) {
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
    }

    public void addLivro(Livro livro) {
        this.livros += livro.toString() + "\n";

    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas += disciplina.toString() + "\n";
        this.CH += disciplina.getChTotal();
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

}
