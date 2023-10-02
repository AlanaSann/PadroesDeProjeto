package Produtos;

import java.util.List;

import prototype.Prototype;

public class Curso extends Produto implements Prototype {
    private int CHtotal;
    private double porcentagemCumprida;

    private List<Livro> listLivros;
    private List<Disciplina> listDisciplinas;

    public Curso(String codigo, String nome) {
        super(codigo, nome);
    }

    private Curso(Curso curso) {
        super(curso);
        CHtotal = curso.getCHtotal();
        porcentagemCumprida = curso.getPorcentagemCumprida();

    }

    public void addLivro(Livro livro) {
        listLivros.add(livro);
    }

    public void addDisciplina(Disciplina disciplina) {
        listDisciplinas.add(disciplina);
    }

    @Override
    public String toString() {
        return "Curso [listLivros=" + listLivros + ", listDisciplinas=" + listDisciplinas + "]";
    }

    public int getCHtotal() {
        return CHtotal;
    }

    public double getPorcentagemCumprida() {
        return porcentagemCumprida;
    }

    public void setPorcentagemCumprida(double porcentagemCumprida) {
        this.porcentagemCumprida = porcentagemCumprida;
    }

    @Override
    public Prototype clonar() {
        return new Curso(this);
    }

}
