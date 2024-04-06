public class teste {
    public static void main (String[] args){
        
        Estoque armazemDeProdutos = new Estoque();
        Data dataProduto = new Data();
        Data dataProduto2 = new Data();

        Produto produto1 = new Produto();
        produto1.codigo = 123;
        produto1.nome = "arroz Tio joao";
        produto1.preco = 11.5f;
        produto1.quantidade = 4;

        produto1.dataAtualizacao = dataProduto;
        produto1.dataAtualizacao.dia = 30;
        produto1.dataAtualizacao.mes = 3;
        produto1.dataAtualizacao.ano = 24;

        Produto produto2 = new Produto();
        produto2.codigo = 4002;
        produto2.nome = "bom bril";
        produto2.preco = 7.5f;
        produto2.quantidade = 8;

        produto2.dataAtualizacao = dataProduto2;
        produto2.dataAtualizacao.dia = 23;
        produto2.dataAtualizacao.mes = 9;
        produto2.dataAtualizacao.ano = 24;

        //impressão de um produto especifíco:
        System.out.println("Imprimindo a lista desse produto especifico:\n" + produto1.listaImpressaoProduto());
        System.out.println("\n\nImprimindo a lista desse produto especifico:\n" + produto2.listaImpressaoProduto());

        //guardando os objetos de "Produto" na variável "armazemDeProdutos" no método "AdicionarProdutoNoEstoque()" da classe Estoque.
        //OBS: Essa é a conexão da classe produto e estoque, por meio desse método: "AdicionarProdutoNoEstoque()".
        armazemDeProdutos.AdicionarProdutoNoEstoque(produto1);
        armazemDeProdutos.AdicionarProdutoNoEstoque(produto2);

        //imprimir todo o estoque:
        armazemDeProdutos.ListaImpressaoEstoque();


    }
}
