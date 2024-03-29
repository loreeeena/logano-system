/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frmpagos.java
 *
 * Created on 12/08/2011, 14:59:53
 */

package logano;

import loganosystem.contrato.Pagos;
import util.Helper;

/**
 *
 * @author loreh
 */
public class Frmpagos extends FrmBaseEdicion {

    Pagos pagos = new Pagos();
    /** Creates new form Frmpagos */
    public Frmpagos() {
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

        txtimporte = new javax.swing.JLabel();
        btaceptar = new javax.swing.JButton();
        btlimpiar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        tbimporte = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(logano.LoganoApp.class).getContext().getResourceMap(Frmpagos.class);
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
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btaceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btcancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtimporte)
                        .addGap(18, 18, 18)
                        .addComponent(tbimporte, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbimporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtimporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btaceptar)
                    .addComponent(btlimpiar)
                    .addComponent(btcancelar))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btcancelarActionPerformed

    private void btaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaceptarActionPerformed
        super.save();
    }//GEN-LAST:event_btaceptarActionPerformed

    private void btlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarActionPerformed
        txtimporte.setText("");
    }//GEN-LAST:event_btlimpiarActionPerformed

    private void tbimporteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbimporteKeyPressed
      Helper.enterKeyPressed(evt, tbimporte);
    }//GEN-LAST:event_tbimporteKeyPressed

     @Override
    protected Pagos getValues()
    {
        this.pagos.setImporte(Long.parseLong(tbimporte.getText()));

        return pagos;
    }

     @Override
    protected void setValues()
    {
        this.tbimporte.setText(String.valueOf(this.pagos.getImporte()));


    }





    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmpagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btaceptar;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btlimpiar;
    private javax.swing.JTextField tbimporte;
    private javax.swing.JLabel txtimporte;
    // End of variables declaration//GEN-END:variables

}
