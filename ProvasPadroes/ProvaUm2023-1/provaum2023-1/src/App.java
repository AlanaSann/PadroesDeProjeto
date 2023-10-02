import java.lang.module.ModuleDescriptor.Builder;

import builderpreparo.Diretor;
import builderpreparo.FichaBuilder;
import builderpreparo.PreparoBuilder;
import singleton.SingletonArmazen;

public class App {
    public static void main(String[] args) throws Exception {
        FichaBuilder preparo = new FichaBuilder();
        Diretor diretor = new Diretor(preparo);
        diretor.criaOvoFrito();
        System.out.println(preparo.getFicha("ovo frito"));

    }
}
