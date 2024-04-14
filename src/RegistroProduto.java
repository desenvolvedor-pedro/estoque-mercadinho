//classe pronta
public class RegistroProduto {

    public void RegistrarProduto(Produto produtoRecemCriado){
        
        //após criar um objeto na Main principal ("produto"), esse objeto é adiocionado em outro objeto chamado de: ("novoProduto").
        Produto novoProduto = new Produto();
        novoProduto.setCodigo(produtoRecemCriado.getCodigo());
        novoProduto.setNome(produtoRecemCriado.getNome());
        novoProduto.setCategoria(produtoRecemCriado.getCategoria());
        novoProduto.setQuantidade(produtoRecemCriado.getQuantidade());
        
        //passando o ("novoProduto") como parâmetro do método para ser armazenado na lista principal do estoque.
        Estoque.AdicionarProdutoNoEstoque(novoProduto);
        
        //realizando a vendas
    }
}