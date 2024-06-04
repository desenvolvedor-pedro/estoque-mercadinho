package data;

import java.util.List;
import java.sql.Timestamp;
import java.util.stream.Collectors;

public class Venda {
    private List<Produto> produtos;
    private double valorTotal;
    private Timestamp dataVenda;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Timestamp getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Timestamp dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getItems() {
        return produtos.stream()
        .map(Produto::getNome)
        .collect(Collectors.joining(", "));
    }
}