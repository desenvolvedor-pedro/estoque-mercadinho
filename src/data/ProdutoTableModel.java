package data;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ProdutoTableModel extends AbstractTableModel {
    private final List<Produto> produtos;
    private final String[] colunas = {"Nome", "Preço", "Quantidade"};

    public ProdutoTableModel(List<Produto> produtos) {
        this.produtos = produtos;
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
        return switch (columnIndex) {
            case 0 -> produto.getNome();
            case 1 -> produto.getPreco();
            case 2 -> produto.getQuantidade();
            default -> null;
        };
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
}
