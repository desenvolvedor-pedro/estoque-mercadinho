import java.util.ArrayList;
import java.util.List;

//Essa classe deve ser refatorada! sem funcionalidade!
class Vendas {
    private List<Produto> produtosVendidos = new ArrayList<>();
    private Estoque checandoEstoque;

    public Vendas(Estoque estoque) {
        this.checandoEstoque = estoque;
    }

    // Método para vender um produto baseado no código do produto.
    public void venderProduto(int codigoDigitado, String nomeDigitado, int quantidadeDigitada) {
        for (Produto percorrendoEstoque : checandoEstoque.getProdutosNoEstoque()) {
            if (percorrendoEstoque.getCodigo() == codigoDigitado && percorrendoEstoque.getNome() == nomeDigitado && percorrendoEstoque.getQuantidade() > quantidadeDigitada) {

                System.out.println("Codigo do produto: " + percorrendoEstoque.getCodigo());
                System.out.println("Nome do produto: " + percorrendoEstoque.getNome());
                System.out.println("preco da venda: " + checandoEstoque.calculandoPrecoDaVenda(quantidadeDigitada));
            }
            else{ 
            System.out.println("Indisponivel no estoque");
            }
        }
    }

    // Método para imprimir todos os produtos vendidos
    public void imprimirProdutosVendidos() {
        System.out.println("\n\n\nRelatório dos produtos vendidos:\n");
        for (Produto percorrendoEstoque : produtosVendidos) {
            System.out.println(percorrendoEstoque.listaImpressaoProduto() + "\n\n");
        }
    }
}
