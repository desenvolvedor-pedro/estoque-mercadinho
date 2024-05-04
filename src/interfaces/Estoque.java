package interfaces;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import data.ProdutoDAO;
import data.Produto;
import data.ProdutoTableModel;
import java.util.List;

public class Estoque extends javax.swing.JFrame {

    public Estoque() {
        initComponents();
        setLocationRelativeTo(null);

        ProdutoDAO produtoDAO = new ProdutoDAO();
        List<Produto> listaProdutos = produtoDAO.obterProdutos();
        ProdutoTableModel modelo = new ProdutoTableModel(listaProdutos);
        jTableProdutos.setModel(modelo);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstoque = new javax.swing.ButtonGroup();
        Root = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        produtosButton = new javax.swing.JButton();
        adcprodutoButton = new javax.swing.JButton();
        Produtos = new javax.swing.JPanel();
        listaprdtScrollPane = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        voltarButton = new javax.swing.JButton();
        Adicionar = new javax.swing.JPanel();
        voltarButton2 = new javax.swing.JButton();
        adcButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoPreco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoQuantidade = new javax.swing.JTextField();
        undRadioButton = new javax.swing.JRadioButton();
        kgRadioButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        campoNomeProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estoque");
        setResizable(false);

        Root.setLayout(new java.awt.CardLayout());

        produtosButton.setText("Lista de Produtos");
        produtosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosButtonActionPerformed(evt);
            }
        });

        adcprodutoButton.setText("Adicionar Produto");
        adcprodutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adcprodutoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(produtosButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adcprodutoButton)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(produtosButton)
                    .addComponent(adcprodutoButton))
                .addGap(139, 139, 139))
        );

        Root.add(Menu, "card2");

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
        listaprdtScrollPane.setViewportView(jTableProdutos);

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProdutosLayout = new javax.swing.GroupLayout(Produtos);
        Produtos.setLayout(ProdutosLayout);
        ProdutosLayout.setHorizontalGroup(
            ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProdutosLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProdutosLayout.createSequentialGroup()
                        .addComponent(listaprdtScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProdutosLayout.createSequentialGroup()
                        .addComponent(voltarButton)
                        .addContainerGap())))
        );
        ProdutosLayout.setVerticalGroup(
            ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProdutosLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(listaprdtScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(voltarButton)
                .addContainerGap())
        );

        Root.add(Produtos, "card3");

        voltarButton2.setText("Voltar");
        voltarButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButton2ActionPerformed(evt);
            }
        });

        adcButton.setText("Adicionar");

        jLabel1.setText("Preço:");

        jLabel2.setText("Quantidade:");

        campoQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoQuantidadeActionPerformed(evt);
            }
        });

        buttonGroupEstoque.add(undRadioButton);
        undRadioButton.setText("Unidade");

        buttonGroupEstoque.add(kgRadioButton);
        kgRadioButton.setText("Kg");

        jLabel3.setText("Nome do Produto:");

        jLabel4.setText("Codigo:");

        javax.swing.GroupLayout AdicionarLayout = new javax.swing.GroupLayout(Adicionar);
        Adicionar.setLayout(AdicionarLayout);
        AdicionarLayout.setHorizontalGroup(
            AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdicionarLayout.createSequentialGroup()
                .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdicionarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarButton2))
                    .addGroup(AdicionarLayout.createSequentialGroup()
                        .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AdicionarLayout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(adcButton))
                            .addGroup(AdicionarLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(AdicionarLayout.createSequentialGroup()
                                        .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(AdicionarLayout.createSequentialGroup()
                                        .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(kgRadioButton)
                                        .addComponent(undRadioButton)))))
                        .addGap(0, 124, Short.MAX_VALUE)))
                .addContainerGap())
        );
        AdicionarLayout.setVerticalGroup(
            AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdicionarLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(undRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kgRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(adcButton)
                .addGap(33, 33, 33)
                .addComponent(voltarButton2)
                .addContainerGap())
        );

        Root.add(Adicionar, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Root, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Root, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void campoQuantidadeActionPerformed(ActionEvent evt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'campoQuantidadeActionPerformed'");
    }

    private void adcprodutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adcprodutoButtonActionPerformed
        CardLayout cl = (CardLayout) (Root.getLayout());
        cl.show(Root, "card4");
    }//GEN-LAST:event_adcprodutoButtonActionPerformed

    private void voltarButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButton2ActionPerformed
        CardLayout cl = (CardLayout) (Root.getLayout());
        cl.show(Root, "card2");
    }//GEN-LAST:event_voltarButton2ActionPerformed

    private void produtosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosButtonActionPerformed
        CardLayout cl = (CardLayout) (Root.getLayout());
        cl.show(Root, "card3");
    }//GEN-LAST:event_produtosButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        CardLayout cl = (CardLayout) (Root.getLayout());
        cl.show(Root, "card2");
    }//GEN-LAST:event_voltarButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Estoque().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Adicionar;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Produtos;
    private javax.swing.JPanel Root;
    private javax.swing.JButton adcButton;
    private javax.swing.JButton adcprodutoButton;
    private javax.swing.ButtonGroup buttonGroupEstoque;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoNomeProduto;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JTextField campoQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JRadioButton kgRadioButton;
    private javax.swing.JScrollPane listaprdtScrollPane;
    private javax.swing.JButton produtosButton;
    private javax.swing.JRadioButton undRadioButton;
    private javax.swing.JButton voltarButton;
    private javax.swing.JButton voltarButton2;
    // End of variables declaration//GEN-END:variables
}
