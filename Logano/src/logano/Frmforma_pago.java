/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frmforma_pago.java
 *
 * Created on 12/08/2011, 14:42:17
 */

package logano;

import loganosystem.contrato.Entidad;
import loganosystem.contrato.Forma_pago;
import util.Helper;

/**
 *
 * @author loreh
 */
public class Frmforma_pago extends FrmBaseEdicion {


     Forma_pago formap = new Forma_pago();

    /** Creates new form Frmforma_pago */
    public Frmforma_pago() {
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

        txtnombre = new javax.swing.JLabel();
        tbnombre = new javax.swing.JTextField();
        btaceptar = new javax.swing.JButton();
        btlimpiar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(logano.LoganoApp.class).getContext().getResourceMap(Frmforma_pago.class);
        txtnombre.setText(resourceMap.getString("txtnombre.text")); // NOI18N
        txtnombre.setName("txtnombre"); // NOI18N

        tbnombre.setText(resourceMap.getString("tbnombre.text")); // NOI18N
        tbnombre.setName("tbnombre"); // NOI18N
        tbnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnombreActionPerformed(evt);
            }
        });
        tbnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbnombreKeyPressed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(tbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre)
                    .addComponent(tbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btaceptar)
                    .addComponent(btlimpiar)
                    .addComponent(btcancelar))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbnombreActionPerformed

    private void btaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaceptarActionPerformed
        super.save();
    }//GEN-LAST:event_btaceptarActionPerformed

    private void btlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarActionPerformed
       txtnombre.setText("");
    }//GEN-LAST:event_btlimpiarActionPerformed


    @Override
    protected Forma_pago getValues()
    {
        this.formap.setNombre(tbnombre.getText());

        return formap;
    }

    @Override
    protected void setValues()
    {
        this.tbnombre.setText(this.formap.getNombre());


    }



    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btcancelarActionPerformed

    private void tbnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbnombreKeyPressed
        Helper.enterKeyPressed(evt, tbnombre);
    }//GEN-LAST:event_tbnombreKeyPressed



    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmforma_pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btaceptar;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btlimpiar;
    private javax.swing.JTextField tbnombre;
    private javax.swing.JLabel txtnombre;
    // End of variables declaration//GEN-END:variables

}
