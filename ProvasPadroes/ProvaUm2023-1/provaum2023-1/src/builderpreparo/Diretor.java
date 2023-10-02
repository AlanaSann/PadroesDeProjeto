package builderpreparo;

import produtos.Alimento;
import singleton.SingletonArmazen;

public class Diretor {
    Builder builder;
    SingletonArmazen armazen;

    public Diretor(Builder builder) {
        this.builder = builder;
        this.armazen = SingletonArmazen.criarArmazem();
    }

    public void criaOvoFrito() {
        Alimento ovo = new Alimento("ovo");
        ovo.adicionaNutrientes(armazen.criar("proteina", 1, 10));
        Alimento manteiga = new Alimento("manteiga");
        manteiga.adicionaNutrientes(armazen.criar("lipidios", 1, 20));
        Alimento sal = new Alimento("sal");
        manteiga.adicionaNutrientes(armazen.criar("lipidios", 2, 5));
        builder.adicionarAlimentos(ovo);
        builder.adicionarAlimentos(manteiga);
        builder.adicionarAlimentos(sal);
        builder.adicionarAlimentos(sal);
        builder.setLowCarb();
        builder.modoDeFazer("Quebre os seus ovos e coloque na frigideira com manteiga e sal");
    }
}
