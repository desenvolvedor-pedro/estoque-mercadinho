package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendaDAO {
    private static VendaDAO instance;
    private Connection conn;

    public VendaDAO() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sgm-db", "root", "admin");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static VendaDAO getInstance() {
        if (instance == null) {
            instance = new VendaDAO();
        }
        return instance;
    }

    public void salvarVenda(Venda venda) throws SQLException {
        String sql = "INSERT INTO Vendas (produtos, valor_total, data_venda) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, venda.getProdutos().toString());
            pstmt.setDouble(2, venda.getValorTotal());
            pstmt.setTimestamp(3, new java.sql.Timestamp(venda.getDataVenda().getTime()));
            pstmt.executeUpdate();
        }
    }
}