package Produtos;

import prototype.Prototype;

public class Disciplina extends Produto {
    private int chTotal;
    private double porcentagemComprida;

    public Disciplina(String codigo, String nome) {
        super(codigo, nome);
    }

    private Disciplina(Disciplina disciplina) {
        super(disciplina);
        chTotal = disciplina.getChTotal();
        porcentagemComprida = disciplina.getPorcentagemComprida();
    }

    public int getChTotal() {
        return chTotal;
    }

    public double getPorcentagemComprida() {
        return porcentagemComprida;
    }

    @Override
    public String toString() {
        return "Disciplina [chTotal=" + chTotal + ", porcentagemComprida=" + porcentagemComprida + "]";
    }

    @Override
    public Prototype clonar() {
        return new Disciplina(this);
    }

}
