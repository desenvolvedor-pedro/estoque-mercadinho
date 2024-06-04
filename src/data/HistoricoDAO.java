package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HistoricoDAO {
    private static HistoricoDAO instance;
    private Connection conn;

    private HistoricoDAO() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sgm-db", "root", "admin");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static HistoricoDAO getInstance() {
        if (instance == null) {
            instance = new HistoricoDAO();
        }
        return instance;
    }

    public List<Venda> getVendasDiarias() throws SQLException {
        List<Venda> vendas = new ArrayList<>();
        String sql = "SELECT * FROM Vendas WHERE DATE(data_venda) = CURDATE()";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                Venda venda = new Venda();
                java.sql.Timestamp dataVenda = new java.sql.Timestamp(resultSet.getTimestamp("data_venda").getTime());
                venda.setDataVenda(dataVenda);
    
                String produtos = resultSet.getString("produtos");
                List<Produto> listaProdutos = parseItems(produtos);
                venda.setProdutos(listaProdutos);
    
                venda.setValorTotal(resultSet.getDouble("valor_total"));
                vendas.add(venda);
            }
        }
        return vendas;
    }

    private List<Produto> parseItems(String produtos) {
        List<Produto> listaProdutos = new ArrayList<>();
        produtos = produtos.substring(1, produtos.length() - 1);
        String[] produtoStrings = produtos.split(", ");
        for (String produtoString : produtoStrings) {
            String[] parts = produtoString.split(" - ");
            String nome = parts[0];
            String precoString = parts[1].replaceAll("[^\\d.]", "");
            double preco = Double.parseDouble(precoString);
            int codigo = 0;
            int quantidade = 0;
            Produto produto = new Produto(codigo, nome, quantidade, preco);
            listaProdutos.add(produto);
        }
        return listaProdutos;
    }

    public double getTotalVendasDiarias() throws SQLException {
        String sql = "SELECT SUM(valor_total) AS total FROM Vendas WHERE DATE(data_venda) = CURDATE()";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                return resultSet.getDouble("total");
            } else {
                return 0;
            }
        }
    }

    public double getTotalVendasMensais() throws SQLException {
        String sql = "SELECT SUM(valor_total) AS total FROM Vendas WHERE MONTH(data_venda) = MONTH(CURDATE())";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                return resultSet.getDouble("total");
            } else {
                return 0;
            }
        }
    }

    public List<Venda> getVendasMensais() throws SQLException {
        List<Venda> vendas = new ArrayList<>();
        String sql = "SELECT * FROM Vendas WHERE MONTH(data_venda) = MONTH(CURRENT_DATE()) AND YEAR(data_venda) = YEAR(CURRENT_DATE())";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                Venda venda = new Venda();
                java.sql.Timestamp dataVenda = new java.sql.Timestamp(resultSet.getTimestamp("data_venda").getTime());
                venda.setDataVenda(dataVenda);
    
                String produtos = resultSet.getString("produtos");
                List<Produto> listaProdutos = parseItems(produtos);
                venda.setProdutos(listaProdutos);
    
                venda.setValorTotal(resultSet.getDouble("valor_total"));
                vendas.add(venda);
            }
        }
        return vendas;
    }
}