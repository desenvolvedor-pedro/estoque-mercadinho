package interfaces;

import java.awt.CardLayout;
import data.ProdutoDAO;
import data.Produto;
import data.ProdutoTableModel;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;

public class Estoque extends javax.swing.JFrame {

    private ProdutoDAO produtoDAO;

    public Estoque() {
        initComponents();
        setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("src/img/icon.png");
        this.setIconImage(icon.getImage());

        produtoDAO = ProdutoDAO.getInstance();
        List<Produto> listaProdutos = produtoDAO.obterProdutos();
        ProdutoTableModel modelo = new ProdutoTableModel(listaProdutos);
        jTableProdutos.setModel(modelo);

        TableColumnModel columnModel = jTableProdutos.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(90);
        columnModel.getColumn(1).setPreferredWidth(300);
        columnModel.getColumn(2).setPreferredWidth(90);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel3 = new javax.swing.JLabel();
        campoNomeProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        EditarExcluir = new javax.swing.JPanel();
        voltarButton3 = new javax.swing.JButton();
        slvButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campoPreco1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoQuantidade1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoNomeProduto1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoID1 = new javax.swing.JTextField();
        delButton = new javax.swing.JButton();

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
                .addGap(170, 170, 170)
                .addComponent(produtosButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adcprodutoButton)
                .addGap(170, 170, 170))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(produtosButton)
                    .addComponent(adcprodutoButton))
                .addGap(230, 230, 230))
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
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
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
                .addGap(20, 20, 20)
                .addGroup(ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(voltarButton)
                    .addComponent(listaprdtScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        ProdutosLayout.setVerticalGroup(
            ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProdutosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(listaprdtScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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
        adcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adcButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Preço:");

        jLabel2.setText("Quantidade:");

        jLabel3.setText("Nome do Produto:");

        jLabel4.setText("Codigo:");

        javax.swing.GroupLayout AdicionarLayout = new javax.swing.GroupLayout(Adicionar);
        Adicionar.setLayout(AdicionarLayout);
        AdicionarLayout.setHorizontalGroup(
            AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdicionarLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdicionarLayout.createSequentialGroup()
                        .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AdicionarLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(adcButton))
                            .addGroup(AdicionarLayout.createSequentialGroup()
                                .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(226, 226, 226))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdicionarLayout.createSequentialGroup()
                        .addComponent(voltarButton2)
                        .addContainerGap())))
        );
        AdicionarLayout.setVerticalGroup(
            AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdicionarLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adcButton)
                .addGap(140, 140, 140)
                .addComponent(voltarButton2)
                .addContainerGap())
        );

        Root.add(Adicionar, "card4");

        voltarButton3.setText("Voltar");
        voltarButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButton3ActionPerformed(evt);
            }
        });

        slvButton1.setText("Salvar");
        slvButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slvButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Preço:");

        jLabel6.setText("Quantidade:");

        jLabel7.setText("Nome do Produto:");

        jLabel8.setText("Codigo:");

        delButton.setText("Excluir");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EditarExcluirLayout = new javax.swing.GroupLayout(EditarExcluir);
        EditarExcluir.setLayout(EditarExcluirLayout);
        EditarExcluirLayout.setHorizontalGroup(
            EditarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditarExcluirLayout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addGroup(EditarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditarExcluirLayout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(voltarButton3))
                    .addGroup(EditarExcluirLayout.createSequentialGroup()
                        .addGroup(EditarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(EditarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoQuantidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNomeProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoID1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(EditarExcluirLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(delButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slvButton1)))
                .addContainerGap())
        );
        EditarExcluirLayout.setVerticalGroup(
            EditarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditarExcluirLayout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addGroup(EditarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNomeProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoQuantidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EditarExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slvButton1)
                    .addComponent(delButton))
                .addGap(160, 160, 160)
                .addComponent(voltarButton3)
                .addContainerGap())
        );

        Root.add(EditarExcluir, "card5");

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

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
        if (evt.getClickCount() == 2) {
                int row = jTableProdutos.getSelectedRow();
                String codigo = jTableProdutos.getValueAt(row, 0).toString();
                String nome = jTableProdutos.getValueAt(row, 1).toString();
                String quantidade = jTableProdutos.getValueAt(row, 2).toString();
                String preco = jTableProdutos.getValueAt(row, 3).toString();

                campoID1.setText(codigo);
                campoNomeProduto1.setText(nome);
                campoQuantidade1.setText(quantidade);
                campoPreco1.setText(preco);
                
                CardLayout cl = (CardLayout) (Root.getLayout());
                cl.show(Root, "card5");
        }
    }//GEN-LAST:event_jTableProdutosMouseClicked

    private void slvButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slvButton1ActionPerformed
        String codigoStr = campoID1.getText();
        int codigo = Integer.parseInt(codigoStr);
        String nome = campoNomeProduto1.getText();
        String quantidadeStr = campoQuantidade1.getText();
        int quantidade = Integer.parseInt(quantidadeStr);
        String precoStr = campoPreco1.getText().replace(',', '.');
        double preco = Double.parseDouble(precoStr);

        Produto produto = new Produto(codigo, nome, quantidade, preco);
        produtoDAO.atualizarProduto(produto);

        ProdutoTableModel model = (ProdutoTableModel) jTableProdutos.getModel();
        model.updateProdutos();

        CardLayout cl = (CardLayout) (Root.getLayout());
        cl.show(Root, "card3");
    }//GEN-LAST:event_slvButton1ActionPerformed

    private void voltarButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButton3ActionPerformed
        CardLayout cl = (CardLayout) (Root.getLayout());
        cl.show(Root, "card2");
    }//GEN-LAST:event_voltarButton3ActionPerformed

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int confirmacao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este produto?", "Excluir Produto", JOptionPane.YES_NO_OPTION);
        if (confirmacao == JOptionPane.YES_OPTION) {
            String codigoStr = campoID1.getText();
            int codigo = Integer.parseInt(codigoStr);
            produtoDAO.deletarProduto(codigo);
            
            ProdutoTableModel model = (ProdutoTableModel) jTableProdutos.getModel();
            model.updateProdutos();
    
            CardLayout cl = (CardLayout) (Root.getLayout());
            cl.show(Root, "card3");
        }
    }

    private void adcprodutoButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_adcprodutoButtonActionPerformed
        CardLayout cl = (CardLayout) (Root.getLayout());
        cl.show(Root, "card4");
    }// GEN-LAST:event_adcprodutoButtonActionPerformed

    private void produtosButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_produtosButtonActionPerformed
        CardLayout cl = (CardLayout) (Root.getLayout());
        cl.show(Root, "card3");
    }// GEN-LAST:event_produtosButtonActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_voltarButtonActionPerformed
        CardLayout cl = (CardLayout) (Root.getLayout());
        cl.show(Root, "card2");
    }// GEN-LAST:event_voltarButtonActionPerformed

    private void adcButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_adcButtonActionPerformed
        try {
            int codigo = Integer.parseInt(campoID.getText());
            String nome = campoNomeProduto.getText();
            int quantidade = Integer.parseInt(campoQuantidade.getText());
            double preco = Double.parseDouble(campoPreco.getText().replace(',', '.'));
    
            Produto produto = new Produto(codigo, nome, quantidade, preco);
            produtoDAO.adicionarProduto(produto);
    
            ProdutoTableModel modelo = (ProdutoTableModel) jTableProdutos.getModel();
            modelo.updateProdutos();
    
            JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!");
    
            campoID.setText("");
            campoNomeProduto.setText("");
            campoQuantidade.setText("");
            campoPreco.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido nos campos de código, quantidade e preço.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }// GEN-LAST:event_adcButtonActionPerformed

    private void voltarButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_voltarButton2ActionPerformed
        CardLayout cl = (CardLayout) (Root.getLayout());
        cl.show(Root, "card2");
    }// GEN-LAST:event_voltarButton2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Estoque().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Adicionar;
    private javax.swing.JPanel EditarExcluir;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Produtos;
    private javax.swing.JPanel Root;
    private javax.swing.JButton adcButton;
    private javax.swing.JButton adcprodutoButton;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoID1;
    private javax.swing.JTextField campoNomeProduto;
    private javax.swing.JTextField campoNomeProduto1;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JTextField campoPreco1;
    private javax.swing.JTextField campoQuantidade;
    private javax.swing.JTextField campoQuantidade1;
    private javax.swing.JButton delButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JScrollPane listaprdtScrollPane;
    private javax.swing.JButton produtosButton;
    private javax.swing.JButton slvButton1;
    private javax.swing.JButton voltarButton;
    private javax.swing.JButton voltarButton2;
    private javax.swing.JButton voltarButton3;
    // End of variables declaration//GEN-END:variables
}
