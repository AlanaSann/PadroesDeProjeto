package produtos;

import java.util.ArrayList;
import java.util.List;

public class Preparo {
    private String nome;
    private boolean lowCarb;
    private boolean vegano;
    private boolean semLactose;
    private boolean semGluten;
    private boolean reduzidoSodio;
    private String modoDeFazer;
    private List<Alimento> listAlimentos;

    public Preparo() {
        listAlimentos = new ArrayList<Alimento>();
    }

    public void adicionarAlimentos(Alimento alimento) {
        this.listAlimentos.add(alimento);
    }

    public String getNome() {
        return nome;
    }

    public boolean getLowCarb() {
        return lowCarb;
    }

    public boolean getVegano() {
        return vegano;
    }

    public boolean getSemLactose() {
        return semLactose;
    }

    public boolean getSemGluten() {
        return semGluten;
    }

    public boolean getReduzidoSodio() {
        return reduzidoSodio;
    }

    public String getModoDeFazer() {
        return modoDeFazer;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLowCarb(boolean lowCarb) {
        this.lowCarb = lowCarb;
    }

    public void setVegano(boolean vegano) {
        this.vegano = vegano;
    }

    public void setSemLactose(boolean semLactose) {
        this.semLactose = semLactose;
    }

    public void setSemGluten(boolean semGluten) {
        this.semGluten = semGluten;
    }

    public void setReduzidoSodio(boolean reduzidoSodio) {
        this.reduzidoSodio = reduzidoSodio;
    }

    public void setModoDeFazer(String modoDeFazer) {
        this.modoDeFazer = modoDeFazer;
    }

    @Override
    public String toString() {
        return "Preparo [nome=" + nome + ", lowCarb=" + lowCarb + ", vegano=" + vegano + ", semLactose=" + semLactose
                + ", semGluten=" + semGluten + ", reduzidoSodio=" + reduzidoSodio + ", modoDeFazer=" + modoDeFazer
                + "]";
    }

}
