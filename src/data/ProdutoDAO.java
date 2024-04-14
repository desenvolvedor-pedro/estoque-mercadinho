package data;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    public List<Produto> obterProdutos() {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Produto 1", 10.99, 100));
        produtos.add(new Produto("Produto 2", 5.49, 200));
        produtos.add(new Produto("Produto 3", 5.55, 288));
        produtos.add(new Produto("Produto 4", 7.15, 152));

        return produtos;
    }
}
