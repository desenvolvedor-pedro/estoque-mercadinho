import java.util.ArrayList;
import java.util.List;

class Estoque {
    int quantidade;
    List<Produto> armazemDeProdutos = new ArrayList<>();
    
    //adicionar na lista "armazemDeProdutos", todos os objetos de Produtos.
    void AdicionarProdutoNoEstoque (Produto item){
        armazemDeProdutos.add(item);
        quantidade++;
    }

    //listar todos os produtos do estoque.
    void ListaImpressaoEstoque(){
        
        System.out.println("\n\n\nRelatorio dos produtos do estoque:\n");
        for (Produto i : armazemDeProdutos){
            System.out.println("Codigo do produto: " + i.codigo +"\nNome: " + i.nome + "\nquantidade: " + i.quantidade + "\npreco: " + i.preco + "\nultima atualizacao no estoque: " + i.dataAtualizacao.formatado() + "\n\n");

        }
        System.out.println("total de produtos no estoque:" + quantidade);
    }
}
