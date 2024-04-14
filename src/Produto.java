//classe pronta
class Produto {
    private int codigo;
    private String nome;
    private String categoria;
    private float precoUnitario;
    private int quantidade;
    private Data dataValidade;
    private String fornecedor;
    private String marca;
    private String origem;
    private float total;
    private Data dataDaAtualizacao;
    private static int produtosRegistrados;
    
    public Produto(){
        Produto.produtosRegistrados++;
    }

    //codigo
    public void setCodigo (int novoCodigo){
        this.codigo = novoCodigo;
    }

    public int getCodigo(){
        return this.codigo;
    }
    
    //nome
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String getNome(){
        return this.nome;
    }
    
    //categoria
    public void setCategoria (String novaCategoria){
        this.categoria = novaCategoria;
    }

    public String getCategoria (){
        return this.categoria;
    }
    
    //preco Unitario
    public void setPrecoUnitario(float novoPreco){
        this.precoUnitario = novoPreco;
    }

    public float getPrecoUnitario(){
        return this.precoUnitario;
    }

    //Quantidade
    public void setQuantidade (int novaQuantidade){
        
        this.quantidade = novaQuantidade;
    }

    public int getQuantidade(){
        return this.quantidade;
    }
    
    //data da validade
    public void setDataValidade(String dia, String mes, String ano){

        this.dataValidade = new Data();
        this.dataValidade.dia = dia;
        this.dataValidade.mes = mes;
        this.dataValidade.ano = ano;
    }

    public String getDataValidade(){
        return this.dataValidade.formatado();
    }

    //fornecedor
    public void setFornecedor (String novoFonecedor){
        this.fornecedor = novoFonecedor;
    }

    public String getFornecedor (){
        return this.fornecedor;
    }

    //marca
    public void setMarca (String novaMarca){
        this.marca = novaMarca;
    }

    public String getMarca (){
        return this.marca;
    }

    //origem (Pode ser o Estado ou país).
    public void setOrigem (String novaOrigem){
        this.origem = novaOrigem;
    }

    public String getOrigem (){
        return this.origem;
    }

    //data da atualizacao
    public void setDataDaAtualizacao (String dia, String mes, String ano){
        this.dataDaAtualizacao = new Data();
        this.dataDaAtualizacao.dia = dia;
        this.dataDaAtualizacao.mes = mes;
        this.dataDaAtualizacao.ano = ano;
    }

    public String getDataAtualizacao(){
        return this.dataDaAtualizacao.formatado();
    }

    //total parcial - calculo de tudo do produto
    public float getTotal(){
        total = this.precoUnitario * this.quantidade;
        return total;
    }

    public static int getProdutosRegistrados(){
        return Produto.produtosRegistrados;
    }

    public String listaImpressaoProduto (){
        String dados = "codigo do produto: " + this.codigo;
        dados += "\nnome: " + this.nome;
        dados += "\npreco Unitario: R$" + this.precoUnitario;
        dados += "\nquantidade disponivel: " + this.quantidade;
        dados += "\ntotal geral: R$" + this.total;
        dados += "\nultima atualizacao do produto no estoque: " + this.dataDaAtualizacao.formatado();
        return dados;
    }
}
