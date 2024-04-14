//
public class Principal {
    public static void main (String[] args){
        
        Produto produto = new Produto();

        //usando os setters: 
        // utilizar campo entrada no Apache para cada método "set".
        produto.setCodigo(4002);
        produto.setNome("Samsung Galaxy S24 Ultra 5g Dual Sim 512 Gb Titanio-violeta 12 Gb Ram");
        produto.setCategoria("Eletronicos/Celulares");
        produto.setPrecoUnitario(799.99f);
        produto.setQuantidade(50);
        produto.setDataValidade("00", "00", "00"); //produto sem validade.
        produto.setFornecedor("alliedBrasil.com.br");
        produto.setMarca("Samsung");
        produto.setOrigem("Campinas (SP) - Brasil");
        produto.setDataDaAtualizacao("12", "04", "2024");

        //Usando/testando os getters:
        System.out.println(produto.getCodigo());
        System.out.println(produto.getNome());
        System.out.println(produto.getCategoria());
        System.out.println(produto.getPrecoUnitario());
        System.out.println(produto.getQuantidade());
        System.out.println(produto.getDataValidade());
        System.out.println(produto.getFornecedor());
        System.out.println(produto.getMarca());
        System.out.println(produto.getOrigem());
        System.out.println(produto.getTotal());
        System.out.println(produto.getDataAtualizacao());
        
        System.out.println(produto.listaImpressaoProduto());
        System.out.println();
        
        RegistroProduto registrando = new RegistroProduto();
        registrando.RegistrarProduto(produto);
        
        //após criarmos o produto, passamos o produto para a classe Estoque
        
        /*realizar a vendas abaixo:
        *!VENDENDO!
        */
    }
}