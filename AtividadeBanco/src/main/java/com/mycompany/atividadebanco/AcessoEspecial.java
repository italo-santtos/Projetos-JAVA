/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividadebanco;

import java.util.ArrayList;

/**
 *
 * @author italodell
 */
public class AcessoEspecial extends javax.swing.JFrame {

    /**
     * Creates new form AcessoEspecial
     */
    public AcessoEspecial() {
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

        Mostrar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Mostrar2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Realizar1 = new javax.swing.JButton();
        Saldo = new javax.swing.JTextField();
        Realizar2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TipoConta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Sacar = new javax.swing.JTextField();
        Depositar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TipoSaque = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Limite = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Mostrar1.setText("Mostrar");
        Mostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostrar1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Conta Especial");

        Mostrar2.setText("Mostrar");
        Mostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostrar2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Saldo");

        Realizar1.setText("Realizar");
        Realizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Realizar1ActionPerformed(evt);
            }
        });

        Saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaldoActionPerformed(evt);
            }
        });

        Realizar2.setText("Realizar");
        Realizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Realizar2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo de conta");

        jLabel4.setText("Sacar");

        Sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SacarActionPerformed(evt);
            }
        });

        jLabel5.setText("Depositar");

        jButton1.setText("Voltar ao menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TipoSaque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Limite Especial", "Saldo" }));

        jLabel6.setText("Limite de Credito:");

        jButton2.setText("Mostrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Sacar, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Depositar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Realizar2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TipoSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Realizar1))))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Mostrar1)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TipoConta, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mostrar2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Limite, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mostrar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Limite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mostrar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sacar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Realizar1)
                    .addComponent(TipoSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Depositar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Realizar2))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    ArrayList<Especial> especial1 = new ArrayList<>();

    public void setEspecial1(ArrayList<Especial> especial1) {
        this.especial1 = especial1;
    }
    int Escolhida;

    private void Mostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostrar1ActionPerformed
        // TODO add your handling code here:
        for(Especial c1 : especial1){
            if(c1.getNumConta() == Escolhida){
                Saldo.setText(String.valueOf(c1.getSaldo())); 
            }

        }
    }//GEN-LAST:event_Mostrar1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        for(Especial c1 : especial1){
            if(c1.getNumConta() == Escolhida){
                Limite.setText(String.valueOf(c1.getEspecial()));   
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SacarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SacarActionPerformed

    private void SaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaldoActionPerformed

    private void Mostrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostrar2ActionPerformed
        // TODO add your handling code here:
        for(Especial c1 : especial1){
            if(c1.getNumConta() == Escolhida){
                TipoConta.setText(String.valueOf(c1.TipoConta()));   
            }

        }
    }//GEN-LAST:event_Mostrar2ActionPerformed

    private void Realizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Realizar1ActionPerformed
        // TODO add your handling code here:
        String tipo = (String) TipoSaque.getSelectedItem();
        
        if(tipo == "Limite Especial"){
            for(Especial c1 : especial1){
            if(c1.getNumConta() == Escolhida){
                c1.sacar(Double.parseDouble(Sacar.getText()), 1);
            }
        }
        }
        if(tipo == "Saldo"){
            for(Especial c1 : especial1){
            if(c1.getNumConta() == Escolhida){
                c1.Sacar(Double.parseDouble(Sacar.getText()));
            }
        }
        
        }
        
        
        
        
        for(Especial c1 : especial1){
            if(c1.getNumConta() == Escolhida){
                Saldo.setText(String.valueOf(c1.getEspecial()));   
            }

        }
        
        
        
        
    }//GEN-LAST:event_Realizar1ActionPerformed

    private void Realizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Realizar2ActionPerformed
        // TODO add your handling code here:
        for(Especial c1 : especial1){
            if(c1.getNumConta() == Escolhida){
                c1.Depositar(Double.parseDouble(Depositar.getText()));
            }

        }
        
    }//GEN-LAST:event_Realizar2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AcessoEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcessoEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcessoEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcessoEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcessoEspecial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Depositar;
    private javax.swing.JTextField Limite;
    private javax.swing.JButton Mostrar1;
    private javax.swing.JButton Mostrar2;
    private javax.swing.JButton Realizar1;
    private javax.swing.JButton Realizar2;
    private javax.swing.JTextField Sacar;
    private javax.swing.JTextField Saldo;
    private javax.swing.JTextField TipoConta;
    private javax.swing.JComboBox<String> TipoSaque;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
