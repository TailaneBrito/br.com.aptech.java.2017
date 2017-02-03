/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.FilmeDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Filme;

/**
 *
 * @author Aluno
 */
public class TelaAumentarNota extends javax.swing.JFrame {

    /**
     * Creates new form FormPadrao
     */
    public TelaAumentarNota() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPainelPadrao = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnAumentar = new javax.swing.JButton();
        btnResetar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlPainelPadrao.setBackground(new java.awt.Color(204, 255, 204));
        pnlPainelPadrao.setForeground(new java.awt.Color(51, 51, 51));
        pnlPainelPadrao.setMinimumSize(new java.awt.Dimension(300, 250));
        pnlPainelPadrao.setPreferredSize(new java.awt.Dimension(300, 250));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setText("Aumentar Nota do Filme em 1");

        jLabel1.setText("ID");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnAumentar.setText("Alterar");
        btnAumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentarActionPerformed(evt);
            }
        });

        btnResetar.setText("Resetar");
        btnResetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPainelPadraoLayout = new javax.swing.GroupLayout(pnlPainelPadrao);
        pnlPainelPadrao.setLayout(pnlPainelPadraoLayout);
        pnlPainelPadraoLayout.setHorizontalGroup(
            pnlPainelPadraoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPainelPadraoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPainelPadraoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlPainelPadraoLayout.createSequentialGroup()
                        .addComponent(btnResetar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAumentar))
                    .addGroup(pnlPainelPadraoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPainelPadraoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        pnlPainelPadraoLayout.setVerticalGroup(
            pnlPainelPadraoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPainelPadraoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(27, 27, 27)
                .addGroup(pnlPainelPadraoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addGroup(pnlPainelPadraoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAumentar)
                    .addComponent(btnResetar))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPainelPadrao, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPainelPadrao, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentarActionPerformed
        // TODO add your handling code here:
        Filme f1 = new Filme();
        
        f1.id = Integer.parseInt(txtId.getText());
                    
        try {
            FilmeDAO fd = new FilmeDAO();
            
            fd.aumentarNotaEmUmPontoDadoPeloId(f1.id);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TelaAumentarNota.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAumentarActionPerformed

    private void btnResetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetarActionPerformed
        // TODO add your handling code here:
        //txtId.setText("");
        txtId.setText("");
       
        
    }//GEN-LAST:event_btnResetarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void pacoca(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAumentarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAumentarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAumentarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAumentarNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAumentarNota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAumentar;
    private javax.swing.JButton btnResetar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlPainelPadrao;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
