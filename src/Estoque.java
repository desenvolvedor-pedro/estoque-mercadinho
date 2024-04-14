import java.util.ArrayList;
import java.util.List;

class Estoque {

    private static List<Produto> depositoDeProdutos = new ArrayList<>();
    
    //adicionar na lista "depositoDeProdutos", todos os objetos de Produtos.
    public static void AdicionarProdutoNoEstoque (Produto item){
        depositoDeProdutos.add(item);
    }

    /*Deve-se funcionalidade para remover do depositoDeProduto a quantidade *de após a venda.
    *public static void RemovendoDoEstoquePosVenda(int quantidadeDigitada){      
    *}*/
    
    public List<Produto> getProdutosNoEstoque(){
        return Estoque.depositoDeProdutos;
    }

    /*Deve-se implementar a funcionalidade para calcular o preco unitário * quantidade do produto escolhido.
    *public int calculandoPrecoDaVenda(int quantidadeDigitada){
    *   
    }*/

    public void ListaImpressaoDeposito(){
        System.out.println("\n\n\nRelatorio dos produtos do estoque:\n");
    
        for (Produto i : depositoDeProdutos){
            System.out.println("Codigo do produto: " + i.getCodigo() +"\nNome: " + i.getNome() + "\nquantidade: " + i.getQuantidade() + "\npreco Unitario: " + i.getPrecoUnitario() + "\ntotal parcial:" + i.getTotal() + "\nultima atualizacao no estoque: " + i.getDataAtualizacao() + "\n\n");
        }

        int total = Produto.getProdutosRegistrados();
        System.out.println("total de produtos no estoque:" + total);
    }
}
