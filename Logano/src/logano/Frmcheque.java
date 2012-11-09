/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Cheque.java
 *
 * Created on 29/05/2011, 13:11:52
 */

package logano;

import loganosystem.contrato.Cheque;
import loganosystem.negocio.ChequeNegocio;
import loganosystem.negocio.EntidadNegocio;
import util.Helper;

/**
 *
 * @author loreh
 */
public class Frmcheque extends FrmBaseEdicion {

    Cheque cheque = new Cheque();
    ChequeNegocio chequeNegocio = new ChequeNegocio();
    /** Creates new form Cheque */
    public Frmcheque() {
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

        txtnºcheque = new javax.swing.JLabel();
        txtimporte = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JLabel();
        tbImporte = new javax.swing.JTextField();
        tbNro = new javax.swing.JTextField();
        tbDescripcion = new javax.swing.JTextField();
        btaceptar = new javax.swing.JButton();
        btlimpiar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(logano.LoganoApp.class).getContext().getResourceMap(Frmcheque.class);
        txtnºcheque.setText(resourceMap.getString("txtnºcheque.text")); // NOI18N
        txtnºcheque.setName("txtnºcheque"); // NOI18N

        txtimporte.setText(resourceMap.getString("txtimporte.text")); // NOI18N
        txtimporte.setName("txtimporte"); // NOI18N

        txtdescripcion.setText(resourceMap.getString("txtdescripcion.text")); // NOI18N
        txtdescripcion.setName("txtdescripcion"); // NOI18N

        tbImporte.setText(resourceMap.getString("tbImporte.text")); // NOI18N
        tbImporte.setName("tbImporte"); // NOI18N
        tbImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbImporteKeyPressed(evt);
            }
        });

        tbNro.setText(resourceMap.getString("tbNro.text")); // NOI18N
        tbNro.setName("tbNro"); // NOI18N
        tbNro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbNroKeyPressed(evt);
            }
        });

        tbDescripcion.setText(resourceMap.getString("tbDescripcion.text")); // NOI18N
        tbDescripcion.setName("tbDescripcion"); // NOI18N
        tbDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbDescripcionKeyPressed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnºcheque, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtimporte)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btaceptar)
                        .addComponent(txtdescripcion)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbNro)
                            .addComponent(tbDescripcion)
                            .addComponent(tbImporte, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btcancelar)))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnºcheque)
                    .addComponent(tbNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtimporte)
                    .addComponent(tbImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdescripcion)
                    .addComponent(tbDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btaceptar)
                    .addComponent(btcancelar)
                    .addComponent(btlimpiar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaceptarActionPerformed
        super.save();
    }//GEN-LAST:event_btaceptarActionPerformed

    @Override
    protected Cheque getValues()
    {
        this.cheque.setNro_cheque(Integer.parseInt(tbNro.getText()));
        this.cheque.setDescripcion(tbDescripcion.getText());
        this.cheque.setImporte(Double.parseDouble(tbImporte.getText()));
        return cheque;
    }

    @Override
    protected void setValues()
    {
        this.tbDescripcion.setText(this.cheque.getDescripcion());
        this.tbImporte.setText(String.valueOf( this.cheque.getImporte()));
        this.tbNro.setText(String.valueOf(this.cheque.getNro_cheque()));
    }

    private void btlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarActionPerformed

        tbNro.setText("");
        tbImporte.setText("");
        tbDescripcion.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btlimpiarActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed

        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btcancelarActionPerformed

    private void tbNroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbNroKeyPressed
       Helper.enterKeyPressed(evt, tbImporte);
    }//GEN-LAST:event_tbNroKeyPressed

    private void tbImporteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbImporteKeyPressed
         Helper.enterKeyPressed(evt, tbDescripcion);
    }//GEN-LAST:event_tbImporteKeyPressed

    private void tbDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDescripcionKeyPressed
         Helper.enterKeyPressed(evt, tbNro);
    }//GEN-LAST:event_tbDescripcionKeyPressed


    @Override
    protected EntidadNegocio getNegocio()
    {
        return this.chequeNegocio;
    }



    






    /*
     *
     *
     *
     *
     *
     *
     *
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmcheque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btaceptar;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btlimpiar;
    private javax.swing.JTextField tbDescripcion;
    private javax.swing.JTextField tbImporte;
    private javax.swing.JTextField tbNro;
    private javax.swing.JLabel txtdescripcion;
    private javax.swing.JLabel txtimporte;
    private javax.swing.JLabel txtnºcheque;
    // End of variables declaration//GEN-END:variables

}