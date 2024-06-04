package data;

import javax.swing.table.AbstractTableModel;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class ProdutoTableModel extends AbstractTableModel {
    private final List<Produto> produtos;
    private final String[] colunas = {"Código", "Nome", "Quantidade", "Preço"};

    public ProdutoTableModel(List<Produto> produtos) {
        this.produtos = ProdutoDAO.getInstance().obterProdutos();
    }

    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
public Object getValueAt(int rowIndex, int columnIndex) {
    Produto produto = produtos.get(rowIndex);
    switch (columnIndex) {
        case 0:
            return produto.getCodigo();
        case 1:
            return produto.getNome();
        case 2:
            return produto.getQuantidade();
        case 3:
            NumberFormat formatter = NumberFormat.getNumberInstance(Locale.forLanguageTag("pt-BR"));
            formatter.setMinimumFractionDigits(2);
            formatter.setMaximumFractionDigits(2);
            return formatter.format(produto.getPreco());
        default:
            return null;
    }
}

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
        fireTableDataChanged();
    }

    public void updateProdutos() {
        this.produtos.clear();
        this.produtos.addAll(ProdutoDAO.getInstance().obterProdutos());
        fireTableDataChanged();
    }
}