package interfaces;

import java.sql.SQLException;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import data.HistoricoDAO;
import data.Produto;
import data.Venda;
import java.awt.CardLayout;

public class Relatorios extends javax.swing.JFrame {

    public Relatorios() {
        initComponents();
        setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("src/img/icon.png");
        this.setIconImage(icon.getImage());

        DefaultTableModel model = new DefaultTableModel(new Object[][] {},
                new String[] { "Data/Hora", "Items", "Valor Total" }) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTableVendas.setModel(model);

        TableColumnModel columnModel = jTableVendas.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(90);
        columnModel.getColumn(1).setPreferredWidth(300);
        columnModel.getColumn(2).setPreferredWidth(90);

        NumberFormat nf = NumberFormat.getNumberInstance(Locale.forLanguageTag("pt-BR"));
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        try {
            List<Venda> vendas = HistoricoDAO.getInstance().getVendasDiarias();
            for (Venda venda : vendas) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                LocalDateTime dateTime = venda.getDataVenda().toLocalDateTime();
                String formattedDateTime = dateTime.format(formatter);

                String items = venda.getProdutos().stream()
                        .map(Produto::getNome)
                        .collect(Collectors.joining(", "));
                String valorTotal = nf.format(venda.getValorTotal());
                model.addRow(new Object[] { formattedDateTime, items, valorTotal });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            calcularTotalVendas();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        DefaultTableModel model2 = new DefaultTableModel(new Object[][] {},
                new String[] { "Data/Hora", "Items", "Valor Total" }) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTableVendas2.setModel(model2);

        TableColumnModel columnModel2 = jTableVendas2.getColumnModel();
        columnModel2.getColumn(0).setPreferredWidth(90);
        columnModel2.getColumn(1).setPreferredWidth(300);
        columnModel2.getColumn(2).setPreferredWidth(90);

        try {
            List<Venda> vendasMensais = HistoricoDAO.getInstance().getVendasMensais();
            for (Venda venda : vendasMensais) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                LocalDateTime dateTime = venda.getDataVenda().toLocalDateTime();
                String formattedDateTime = dateTime.format(formatter);
    
                String items = venda.getProdutos().stream()
                        .map(Produto::getNome)
                        .collect(Collectors.joining(", "));
                String valorTotal = nf.format(venda.getValorTotal());
                model2.addRow(new Object[] { formattedDateTime, items, valorTotal });
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        try {
            calcularTotalVendasMensais();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Root = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Diario = new javax.swing.JPanel();
        totalVendasLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVendas = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        Mensal = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableVendas2 = new javax.swing.JTable();
        totalVendasLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatórios de Vendas");
        setResizable(false);

        Root.setLayout(new java.awt.CardLayout());

        jButton1.setText("Diário");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Mensal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Selecione o tipo de Relátorio");

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(204, 204, 204))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(224, 224, 224))
        );

        Root.add(Menu, "card4");

        totalVendasLabel.setText("Total de vendas do dia: 0,00");

        jTableVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVendasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVendas);

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DiarioLayout = new javax.swing.GroupLayout(Diario);
        Diario.setLayout(DiarioLayout);
        DiarioLayout.setHorizontalGroup(
            DiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiarioLayout.createSequentialGroup()
                .addGroup(DiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3)
                        .addGroup(DiarioLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DiarioLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(totalVendasLabel)))
                .addContainerGap())
        );
        DiarioLayout.setVerticalGroup(
            DiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DiarioLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(totalVendasLabel)
                .addGap(4, 4, 4)
                .addComponent(jButton3)
                .addContainerGap())
        );

        Root.add(Diario, "card2");

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTableVendas2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableVendas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVendas2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableVendas2);

        totalVendasLabel1.setText("Total de vendas do mês: 0,00");

        javax.swing.GroupLayout MensalLayout = new javax.swing.GroupLayout(Mensal);
        Mensal.setLayout(MensalLayout);
        MensalLayout.setHorizontalGroup(
            MensalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MensalLayout.createSequentialGroup()
                .addGroup(MensalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MensalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4))
                    .addGroup(MensalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MensalLayout.createSequentialGroup()
                .addComponent(totalVendasLabel1)
                .addGap(220, 220, 220))
        );
        MensalLayout.setVerticalGroup(
            MensalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MensalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalVendasLabel1)
                .addGap(7, 7, 7)
                .addComponent(jButton4)
                .addContainerGap())
        );

        Root.add(Mensal, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableVendas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVendas2MouseClicked
        int row = jTableVendas2.rowAtPoint(evt.getPoint());
        int col = jTableVendas2.columnAtPoint(evt.getPoint());
        if (row >= 0 && col >= 0) {
            String items = (String) jTableVendas2.getValueAt(row, col);
            JOptionPane.showMessageDialog(null, items, "Items", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jTableVendas2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        CardLayout cl = (CardLayout) (Root.getLayout());
        cl.show(Root, "card4");
    }// GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        CardLayout cl = (CardLayout) (Root.getLayout());
        cl.show(Root, "card2");
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        CardLayout cl = (CardLayout) (Root.getLayout());
        cl.show(Root, "card4");
    }// GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        CardLayout cl = (CardLayout) (Root.getLayout());
        cl.show(Root, "card3");
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jTableVendasMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTableVendasMouseClicked
        int row = jTableVendas.rowAtPoint(evt.getPoint());
        int col = jTableVendas.columnAtPoint(evt.getPoint());
        if (row >= 0 && col >= 0) {
            String items = (String) jTableVendas.getValueAt(row, col);
            JOptionPane.showMessageDialog(null, items, "Items", JOptionPane.INFORMATION_MESSAGE);
        }
    }// GEN-LAST:event_jTableVendasMouseClicked

    private void calcularTotalVendas() throws SQLException {
        double totalVendas = HistoricoDAO.getInstance().getTotalVendasDiarias();
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.forLanguageTag("pt-BR"));
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        String totalVendasFormatado = nf.format(totalVendas);
        totalVendasLabel.setText("Total de vendas do dia: " + totalVendasFormatado);
    }

    private void calcularTotalVendasMensais() throws SQLException {
        double totalVendas = HistoricoDAO.getInstance().getTotalVendasMensais();
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.forLanguageTag("pt-BR"));
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        String totalVendasFormatado = nf.format(totalVendas);
        totalVendasLabel1.setText("Total de vendas do mês: " + totalVendasFormatado);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Diario;
    private javax.swing.JPanel Mensal;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Root;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableVendas;
    private javax.swing.JTable jTableVendas2;
    private javax.swing.JLabel totalVendasLabel;
    private javax.swing.JLabel totalVendasLabel1;
    // End of variables declaration//GEN-END:variables
}
