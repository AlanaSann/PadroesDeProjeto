package Produtos;

import prototype.Prototype;

public class Livro extends Produto {

    private String isbn;

    public Livro(String codigo, String nome) {
        super(codigo, nome);
        this.isbn = codigo;
    }

    private Livro(Livro livro) {
        super(livro);
        isbn = livro.getIsnb();
    }

    public String getIsnb() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Livro [isnb=" + isbn + "]";
    }

    @Override
    public Prototype clonar() {
        return new Livro(this);
    }

}