package Singleton;

import java.util.ArrayList;
import java.util.List;

import Produtos.Curso;

public class Singleton {
    private static Singleton singleton;
    private List<Curso> listCursos;

    private Singleton() {
        this.listCursos = new ArrayList<Curso>();
    }

    public static Singleton getSingleton() {
        if (Singleton.singleton == null) {
            return new Singleton();
        }
        return Singleton.singleton;
    }

    public void addCursos(Curso curso) {
        listCursos.add(curso);
    }

    public Curso jaExiteCurso(String codigo){
        for (Curso curso : listCursos) {
            if(curso.getCodigo().equals(codigo)){
                return (Curso)curso.clonar();
            }
        }
        return null;
    }
}
