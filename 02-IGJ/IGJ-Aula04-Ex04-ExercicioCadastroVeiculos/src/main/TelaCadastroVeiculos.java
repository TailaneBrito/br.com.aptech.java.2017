/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Aluno
 */
public class TelaCadastroVeiculos extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroVeiculos
     */
    public TelaCadastroVeiculos() {
        initComponents();
        pnlPainel2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPainel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        spnKMs = new javax.swing.JSpinner();
        txtFabricante = new javax.swing.JComboBox<>();
        txtModelo = new javax.swing.JTextField();
        txtChassi = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pnlPainel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblFabricante = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblChassi = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblKms = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frmJanela"); // NOI18N
        setResizable(false);

        pnlPainel1.setBackground(new java.awt.Color(153, 204, 255));
        pnlPainel1.setMaximumSize(new java.awt.Dimension(400, 450));
        pnlPainel1.setMinimumSize(new java.awt.Dimension(400, 450));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("CADASTRO DE VEÍCULOS");

        jLabel2.setText("Código");

        jLabel3.setText("Fabricante");

        jLabel4.setText("Modelo");

        jLabel5.setText("Ano");

        jLabel6.setText("Chassi");

        jLabel7.setText("KMs");

        spnKMs.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                spnKMsComponentMoved(evt);
            }
        });

        txtFabricante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Volks", "Honda", "Toyota", "Nissan" }));
        txtFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFabricanteActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("SALVAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pnlPainel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Dados Cadastrados");

        jLabel9.setText("Código..........................:");

        lblCodigo.setText("0");

        lblFabricante.setText("0");

        jLabel12.setText("Fabricante.....................:");

        jLabel13.setText("Modelo.........................:");

        lblModelo.setText("0");

        jLabel15.setText("Ano.............................:");

        lblAno.setText("0");

        jLabel17.setText("Chassi..........................:");

        lblChassi.setText("0");

        jLabel19.setText("Kms.............................:");

        lblKms.setText("0");

        javax.swing.GroupLayout pnlPainel2Layout = new javax.swing.GroupLayout(pnlPainel2);
        pnlPainel2.setLayout(pnlPainel2Layout);
        pnlPainel2Layout.setHorizontalGroup(
            pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPainel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(pnlPainel2Layout.createSequentialGroup()
                        .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKms)
                            .addComponent(lblChassi)
                            .addComponent(lblAno)
                            .addComponent(lblModelo)
                            .addComponent(lblFabricante)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        pnlPainel2Layout.setVerticalGroup(
            pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPainel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblCodigo))
                .addGap(18, 18, 18)
                .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFabricante)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblModelo))
                .addGap(18, 18, 18)
                .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblAno))
                .addGap(18, 18, 18)
                .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblChassi))
                .addGap(18, 18, 18)
                .addGroup(pnlPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblKms))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlPainel1Layout = new javax.swing.GroupLayout(pnlPainel1);
        pnlPainel1.setLayout(pnlPainel1Layout);
        pnlPainel1Layout.setHorizontalGroup(
            pnlPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPainel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPainel1Layout.createSequentialGroup()
                .addGroup(pnlPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPainel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlPainel1Layout.createSequentialGroup()
                                .addGroup(pnlPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(txtFabricante, 0, 129, Short.MAX_VALUE))
                                .addGap(53, 53, 53)
                                .addGroup(pnlPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlPainel1Layout.createSequentialGroup()
                                .addGroup(pnlPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addGroup(pnlPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(spnKMs, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                        .addComponent(txtAno)))
                                .addGap(53, 53, 53)
                                .addGroup(pnlPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlPainel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtChassi)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(pnlPainel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPainel1Layout.setVerticalGroup(
            pnlPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPainel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(pnlPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPainel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnKMs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(pnlPainel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPainel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlPainel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String codigo = txtCodigo.getText();
        lblCodigo.setText(codigo);
        
        String modelo = txtModelo.getText();
        lblModelo.setText(modelo);
        
        String ano = txtAno.getText();
        lblAno.setText(ano);
        
        String chassi = txtChassi.getText();
        lblChassi.setText(chassi);
        
        String fabricante = String.valueOf(txtFabricante.getSelectedItem());
        lblFabricante.setText(fabricante);
        
        String kms = String.valueOf(spnKMs.getValue());
        lblKms.setText(kms);
        
        pnlPainel2.setVisible(true);
        
        txtCodigo.setText("");
        txtModelo.setText("");
        txtAno.setText("");
        txtChassi.setText("");
        txtFabricante.setSelectedIndex(0);
        spnKMs.setValue(0);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void spnKMsComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_spnKMsComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_spnKMsComponentMoved

    private void txtFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFabricanteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaCadastroVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblChassi;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblKms;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JPanel pnlPainel1;
    private javax.swing.JPanel pnlPainel2;
    private javax.swing.JSpinner spnKMs;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtChassi;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JComboBox<String> txtFabricante;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
