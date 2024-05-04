package interfaces;

import data.ProdutoDAO;
import data.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.Box;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ItemEvent;

public class PDV extends javax.swing.JFrame {

    private double valorTotalAcumulado = 0.0;
    private Map<JSpinner, Double> valorTotalPorLinha = new HashMap<>();
    private List<JPanel> productLines = new ArrayList<>();

    public PDV() {
        initComponents();
        setLocationRelativeTo(null);

        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0, 0, 100, 1);
        jSpinnerQuantidade.setModel(spinnerModel);
    }

    class ProdutoRenderer extends BasicComboBoxRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
                boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            if (value != null) {
                Produto produto = (Produto) value;
                setText(produto.getNome());
            }

            return this;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelValorTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelValorTotalProduto = new javax.swing.JLabel();
        labelValorUnitario = new javax.swing.JLabel();
        comboBoxProdutos = new javax.swing.JComboBox<>();
        jSpinnerQuantidade = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ponto de Venda");
        setMinimumSize(new java.awt.Dimension(450, 350));
        setResizable(false);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");

        jLabel1.setText("Valor Total");

        labelValorTotal.setText("0,00");

        jLabel3.setText("Quantidade");

        jLabel4.setText("Produto");

        jLabel5.setText("Valor unitário");

        jLabel6.setText("Valor total");

        labelValorTotalProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelValorTotalProduto.setText("0,00");

        labelValorUnitario.setText("0,00");

        comboBoxProdutos = createProductComboBox();
        comboBoxProdutos.setPreferredSize(new java.awt.Dimension(72, 30));
        comboBoxProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProdutosActionPerformed(evt);
            }
        });

        jSpinnerQuantidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerQuantidadeStateChanged(evt);
            }
        });

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jButton3.setText("Adicionar Produto");
        jButton3.setAlignmentY(0.0F);
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(150, 150, 150))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(182, 182, 182))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelValorUnitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(labelValorTotalProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(23, 23, 23))))
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelValorUnitario)
                    .addComponent(labelValorTotalProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelValorTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinnerQuantidadeStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_jSpinnerQuantidadeStateChanged
        updateTotalValues(jSpinnerQuantidade);

        /*
         * int quantidade = (int) jSpinnerQuantidade.getValue();
         * Produto produtoSelecionado = (Produto) comboBoxProdutos.getSelectedItem();
         * 
         * if (produtoSelecionado != null) {
         * double valorTotal = quantidade * produtoSelecionado.getPreco();
         * labelValorTotalProduto.setText(String.format("%.2f", valorTotal));
         * } // GEN-LAST:event_jSpinnerQuantidadeStateChanged
         */
    }

    private void comboBoxProdutosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_comboBoxProdutosActionPerformed
        Produto selectedProduct = (Produto) comboBoxProdutos.getSelectedItem();
        if (selectedProduct != null) {
            labelValorUnitario.setText(String.valueOf(selectedProduct.getPreco()));
        } else {
            labelValorUnitario.setText("0,00");
        }
    }// GEN-LAST:event_comboBoxProdutosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelarActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Você realmente deseja cancelar?", "Confirmação",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            jSpinnerQuantidade.setValue(0);
            comboBoxProdutos.setSelectedItem(null);
            labelValorUnitario.setText("0,00");
            labelValorTotalProduto.setText("0,00");

            jPanel1.removeAll();
            jPanel1.revalidate();
            jPanel1.repaint();
        }

    }// GEN-LAST:event_btnCancelarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        JPanel productLine = new JPanel();

        productLine.add(Box.createRigidArea(new Dimension(23, 6)));
        JSpinner jSpinnerQuantidade = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        productLine.add(jSpinnerQuantidade);
        productLine.add(Box.createRigidArea(new Dimension(5, 6)));

        JComboBox<Produto> comboBoxProdutos = createProductComboBox();
        Dimension size = new Dimension(175, 22);
        comboBoxProdutos.setMinimumSize(size);
        comboBoxProdutos.setMaximumSize(size);
        comboBoxProdutos.setPreferredSize(size);
        productLine.add(comboBoxProdutos);
        productLine.add(Box.createRigidArea(new Dimension(30,6)));

        JLabel labelValorUnitario = new JLabel("0,00");
        labelValorUnitario.setPreferredSize(new Dimension(67, labelValorUnitario.getPreferredSize().height));
        productLine.add(labelValorUnitario);
        //productLine.add(Box.createRigidArea(new Dimension(15, 6)));

        JLabel labelValorTotalProduto = new JLabel("0,00");
        labelValorTotalProduto.setPreferredSize(new Dimension(65, labelValorTotalProduto.getPreferredSize().height));
        productLine.add(labelValorTotalProduto);
        //productLine.add(Box.createRigidArea(new Dimension(23, 6)));

        // productLine.setBorder(new EmptyBorder(10, 10, 10, 10));

        comboBoxProdutos.addItemListener((ItemEvent arg0) -> {
            Produto selectedProduct = (Produto) comboBoxProdutos.getSelectedItem();
            labelValorUnitario.setText(String.valueOf(selectedProduct.getPreco()));
        });

        jSpinnerQuantidade.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                /*
                 * JSpinner sourceSpinner = (JSpinner) evt.getSource();
                 * updateTotalValues(sourceSpinner);
                 */

                JSpinner spinner = (JSpinner) evt.getSource();
                int quantidade = (int) spinner.getValue();
                Produto produtoSelecionado = (Produto) comboBoxProdutos.getSelectedItem();

                if (produtoSelecionado != null) {
                    double valorTotalProduto = quantidade * produtoSelecionado.getPreco();

                    Double valorTotalAnterior = valorTotalPorLinha.get(spinner);
                    if (valorTotalAnterior != null) {
                        valorTotalAcumulado -= valorTotalAnterior;
                    }

                    valorTotalAcumulado += valorTotalProduto;

                    valorTotalPorLinha.put(spinner, valorTotalProduto);

                    labelValorTotalProduto.setText(String.format("%.2f", valorTotalProduto));
                    labelValorTotal.setText(String.format("%.2f", valorTotalAcumulado));
                }
            }
        });

        jPanel1.add(productLine, 0);
        productLine.revalidate();
        productLine.repaint();
        productLines.add(productLine);
    }// GEN-LAST:event_jButton3ActionPerformed

    private JComboBox<Produto> createProductComboBox() {// GEN-FIRST:event_createProductComboBox
        JComboBox<Produto> comboBoxProdutos = new JComboBox<Produto>();
        comboBoxProdutos.setRenderer(new ProdutoRenderer());

        ProdutoDAO produtoDAO = new ProdutoDAO();
        List<Produto> produtos = produtoDAO.obterProdutos();
        Produto[] produtosArray = produtos.toArray(new Produto[0]);
        ComboBoxModel<Produto> model = new DefaultComboBoxModel<Produto>(produtosArray);
        comboBoxProdutos.setModel(model);
        comboBoxProdutos.setSelectedItem(null);

        return comboBoxProdutos;
    }// GEN-LAST:event_createProductComboBox

    private void updateTotalValues(JSpinner spinner) {// GEN-FIRST:event_updateTotalValues
        Produto produtoSelecionado = (Produto) comboBoxProdutos.getSelectedItem();

        if (produtoSelecionado == null) {
            return;
        }

        int quantidade = (int) spinner.getValue();

        double valorTotalProduto = quantidade * produtoSelecionado.getPreco();

        Double valorTotalAnterior = valorTotalPorLinha.get(spinner);
        if (valorTotalAnterior != null) {
            valorTotalAcumulado -= valorTotalAnterior;
        }

        valorTotalAcumulado += valorTotalProduto;

        valorTotalPorLinha.put(spinner, valorTotalProduto);

        labelValorTotalProduto.setText(String.format("%.2f", valorTotalProduto));
        labelValorTotal.setText(String.format("%.2f", valorTotalAcumulado));
    }// GEN-LAST:event_updateTotalValues

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
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new PDV().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<Produto> comboBoxProdutos;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerQuantidade;
    private javax.swing.JLabel labelValorTotal;
    private javax.swing.JLabel labelValorTotalProduto;
    private javax.swing.JLabel labelValorUnitario;
    // End of variables declaration//GEN-END:variables
}
