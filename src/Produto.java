class Produto {
    int quantidade;
    String nome;
    float preco;
    Data dataAtualizacao;
    int codigo;

    //Impressão de um produto especifíco:
    String listaImpressaoProduto (){
        String dados = "codigo do produto: " + this.codigo;
        dados += "\nnome: " + this.nome;
        dados += "\npreco: " + this.preco;
        dados += "\nquantidade disponivel: " + this.quantidade;
        dados += "\nultima atualizacao do produto no estoque: " + this.dataAtualizacao.formatado();

        return dados;
    }
}
