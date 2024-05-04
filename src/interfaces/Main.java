package interfaces;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showConfirmDialog(
                    Main.this,
                    "Você tem certeza que deseja fechar o programa?",
                    "Fechamento",
                    JOptionPane.YES_NO_OPTION
                );
                if (confirm == JOptionPane.YES_OPTION) {
                    Main.this.dispose();
                }
            }
        });
        
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        mainMenuBar = new javax.swing.JMenuBar();
        pdvMenu = new javax.swing.JMenu();
        estoqueMenu = new javax.swing.JMenu();
        relatoriosMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SGM");
        setResizable(false);

        labelLogo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelLogo.setText("SGM");

        pdvMenu.setText("Ponto de Venda");
        pdvMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdvMenuMouseClicked(evt);
            }
        });
        mainMenuBar.add(pdvMenu);

        estoqueMenu.setText("Estoque");
        estoqueMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estoqueMenuMouseClicked(evt);
            }
        });
        mainMenuBar.add(estoqueMenu);

        relatoriosMenu.setText("Relatórios");
        mainMenuBar.add(relatoriosMenu);

        setJMenuBar(mainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(125, 125, 125))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pdvMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdvMenuMouseClicked
        PDV PDV = new PDV();
        PDV.setVisible(true);
    }//GEN-LAST:event_pdvMenuMouseClicked

    private void estoqueMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estoqueMenuMouseClicked
        Estoque Estoque = new Estoque();
        Estoque.setVisible(true);
    }//GEN-LAST:event_estoqueMenuMouseClicked

    public static void main(String args[]) {
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(() -> {
        new Main().setVisible(true);
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu estoqueMenu;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JMenu pdvMenu;
    private javax.swing.JMenu relatoriosMenu;
    // End of variables declaration//GEN-END:variables
}
