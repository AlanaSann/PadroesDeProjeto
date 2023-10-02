package Produtos;

import prototype.Prototype;

public abstract class Produto implements Prototype {
    protected String codigo;
    protected String nome;
    protected float preco;

    public Produto(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    protected Produto(Produto produto) {
        codigo = produto.getCodigo();
        nome = produto.getNome();
        preco = produto.getPreco();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

}
