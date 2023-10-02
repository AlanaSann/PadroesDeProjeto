package factoryMethod;

import Produtos.Disciplina;
import Produtos.Livro;
import Produtos.Produto;

public class ProdutoFabrica {
    public Produto criaProduto(TipoProduto tipo, String nome, String codigo) {
        if (tipo == TipoProduto.livro) {
            return new Livro(codigo, nome);
        }
        return new Disciplina(codigo, nome);
    }
}
