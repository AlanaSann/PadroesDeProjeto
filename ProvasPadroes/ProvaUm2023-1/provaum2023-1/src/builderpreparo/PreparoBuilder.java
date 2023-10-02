package builderpreparo;

import produtos.Alimento;
import produtos.Preparo;

public class PreparoBuilder implements Builder {
    private Preparo preparo;

    public PreparoBuilder() {
        preparo = new Preparo();
    }

    @Override
    public void resetar() {
        preparo = new Preparo();
    }

    @Override
    public void setNome(String nome) {
        preparo.setNome(nome);
    }

    @Override
    public void setLowCarb() {
        preparo.setLowCarb(true);
    }

    @Override
    public void setVegano() {
        preparo.setVegano(true);
    }

    @Override
    public void setLactose() {
        preparo.setSemLactose(true);
    }

    @Override
    public void setGluten() {
        preparo.setSemGluten(true);
    }

    @Override
    public void setSodio() {
        preparo.setReduzidoSodio(true);
    }

    @Override
    public void modoDeFazer(String modo) {
        preparo.setModoDeFazer(modo);
    }

    @Override
    public void adicionarAlimentos(Alimento alimento) {
        preparo.adicionarAlimentos(alimento);
    }

    public Preparo getPreparo(String nome) {
        this.preparo.setNome(nome);
        Preparo preparoNovo = preparo;
        this.resetar();
        return preparoNovo;

    }
}
