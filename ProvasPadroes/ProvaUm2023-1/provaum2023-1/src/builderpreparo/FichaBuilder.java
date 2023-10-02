package builderpreparo;

import produtos.Alimento;
import produtos.FichaNutricional;

public class FichaBuilder implements Builder {
    FichaNutricional ficha = new FichaNutricional();

    @Override
    public void setNome(String nome) {
        ficha.setNome(nome);
    }

    @Override
    public void setLowCarb() {
    }

    @Override
    public void setVegano() {
    }

    @Override
    public void setLactose() {
    }

    @Override
    public void setGluten() {
    }

    @Override
    public void setSodio() {
    }

    @Override
    public void modoDeFazer(String modo) {

    }

    @Override
    public void resetar() {
        this.ficha = new FichaNutricional();
    }

    @Override
    public void adicionarAlimentos(Alimento alimento) {
        ficha.adicionarAlimentos(alimento);
    }

    public FichaNutricional getFicha(String nome) {
        this.setNome(nome);
        FichaNutricional fichaClone;
        fichaClone = ficha;
        this.resetar();
        return fichaClone;
    }
}
