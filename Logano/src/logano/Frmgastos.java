/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frmgastos.java
 *
 * Created on 12/08/2011, 14:55:48
 */

package logano;

import loganosystem.contrato.Gastos;
import util.Helper;

/**
 *
 * @author loreh
 */
public class Frmgastos extends FrmBaseEdicion {

      Gastos gastos = new Gastos();
    /** Creates new form Frmgastos */
    public Frmgastos() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtrazonsocial = new javax.swing.JLabel();
        txtimporte = new javax.swing.JLabel();
        btaceptar = new javax.swing.JButton();
        btlimpiar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        tbrazonsocial = new javax.swing.JTextField();
        tbimporte = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(logano.LoganoApp.class).getContext().getResourceMap(Frmgastos.class);
        txtrazonsocial.setText(resourceMap.getString("txtrazonsocial.text")); // NOI18N
        txtrazonsocial.setName("txtrazonsocial"); // NOI18N

        txtimporte.setText(resourceMap.getString("txtimporte.text")); // NOI18N
        txtimporte.setName("txtimporte"); // NOI18N

        btaceptar.setText(resourceMap.getString("btaceptar.text")); // NOI18N
        btaceptar.setName("btaceptar"); // NOI18N
        btaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaceptarActionPerformed(evt);
            }
        });

        btlimpiar.setText(resourceMap.getString("btlimpiar.text")); // NOI18N
        btlimpiar.setName("btlimpiar"); // NOI18N
        btlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimpiarActionPerformed(evt);
            }
        });

        btcancelar.setText(resourceMap.getString("btcancelar.text")); // NOI18N
        btcancelar.setName("btcancelar"); // NOI18N
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        tbrazonsocial.setText(resourceMap.getString("tbrazonsocial.text")); // NOI18N
        tbrazonsocial.setName("tbrazonsocial"); // NOI18N
        tbrazonsocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbrazonsocialKeyPressed(evt);
            }
        });

        tbimporte.setText(resourceMap.getString("tbimporte.text")); // NOI18N
        tbimporte.setName("tbimporte"); // NOI18N
        tbimporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbimporteKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtimporte)
                            .addComponent(txtrazonsocial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbimporte, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbrazonsocial, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btaceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btcancelar)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrazonsocial)
                    .addComponent(tbrazonsocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtimporte)
                    .addComponent(tbimporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btlimpiar)
                    .addComponent(btcancelar)
                    .addComponent(btaceptar))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaceptarActionPerformed
        super.save();
    }//GEN-LAST:event_btaceptarActionPerformed

    private void btlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarActionPerformed
        tbimporte.setText("");
        tbrazonsocial.setText("");
    }//GEN-LAST:event_btlimpiarActionPerformed

     @Override
    protected Gastos getValues()
    {
        this.gastos.setRazon_social(tbrazonsocial.getText());
        this.gastos.setImporte(Long.parseLong(tbimporte.getText()));

        return gastos;
    }

     @Override
    protected void setValues()
    {
        this.tbrazonsocial.setText(this.gastos.getRazon_social());
        this.tbimporte.setText(String.valueOf( this.gastos.getImporte()));

    }





    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btcancelarActionPerformed

    private void tbrazonsocialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbrazonsocialKeyPressed
       Helper.enterKeyPressed(evt, tbimporte);
    }//GEN-LAST:event_tbrazonsocialKeyPressed

    private void tbimporteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbimporteKeyPressed
        Helper.enterKeyPressed(evt, tbrazonsocial);
    }//GEN-LAST:event_tbimporteKeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmgastos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btaceptar;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btlimpiar;
    private javax.swing.JTextField tbimporte;
    private javax.swing.JTextField tbrazonsocial;
    private javax.swing.JLabel txtimporte;
    private javax.swing.JLabel txtrazonsocial;
    // End of variables declaration//GEN-END:variables

}
