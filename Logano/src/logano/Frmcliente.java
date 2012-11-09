/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frmcliente.java
 *
 * Created on 29/05/2011, 13:25:40
 */

package logano;

import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;
import loganosystem.contrato.Cliente;
import loganosystem.negocio.ClienteNegocio;
import loganosystem.negocio.EntidadNegocio;
import util.Helper;

/**
 *
 * @author loreh
 */
public class Frmcliente extends FrmBaseEdicion {

     Cliente cliente = new Cliente();
     ClienteNegocio ClienteNegocio = new ClienteNegocio();


    /** Creates new form Frmcliente */
    public Frmcliente() {
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

        txtdni = new javax.swing.JLabel();
        txtnombre = new javax.swing.JLabel();
        txtapellido = new javax.swing.JLabel();
        txtempresa = new javax.swing.JLabel();
        btaceptar = new javax.swing.JButton();
        btlimpiar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        tbdni = new javax.swing.JTextField();
        tbnombre = new javax.swing.JTextField();
        tbapellido = new javax.swing.JTextField();
        tbempresa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(logano.LoganoApp.class).getContext().getResourceMap(Frmcliente.class);
        txtdni.setText(resourceMap.getString("txtdni.text")); // NOI18N
        txtdni.setName("txtdni"); // NOI18N

        txtnombre.setText(resourceMap.getString("txtnombre.text")); // NOI18N
        txtnombre.setName("txtnombre"); // NOI18N

        txtapellido.setText(resourceMap.getString("txtapellido.text")); // NOI18N
        txtapellido.setName("txtapellido"); // NOI18N

        txtempresa.setText(resourceMap.getString("txtempresa.text")); // NOI18N
        txtempresa.setName("txtempresa"); // NOI18N

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

        tbdni.setText(resourceMap.getString("tbdni.text")); // NOI18N
        tbdni.setName("tbdni"); // NOI18N
        tbdni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tbdniFocusGained(evt);
            }
        });
        tbdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbdniKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbdniKeyPressed(evt);
            }
        });

        tbnombre.setText(resourceMap.getString("tbnombre.text")); // NOI18N
        tbnombre.setName("tbnombre"); // NOI18N
        tbnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbnombreKeyPressed(evt);
            }
        });

        tbapellido.setText(resourceMap.getString("tbapellido.text")); // NOI18N
        tbapellido.setName("tbapellido"); // NOI18N
        tbapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbapellidoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbapellidoKeyReleased(evt);
            }
        });

        tbempresa.setText(resourceMap.getString("tbempresa.text")); // NOI18N
        tbempresa.setName("tbempresa"); // NOI18N
        tbempresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbempresaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtdni)
                        .addGap(18, 18, 18)
                        .addComponent(tbdni, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtapellido)
                            .addComponent(txtempresa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(tbempresa, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))))
                .addGap(200, 200, 200))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdni)
                    .addComponent(tbdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre)
                    .addComponent(tbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtapellido)
                    .addComponent(tbapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtempresa)
                    .addComponent(tbempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btaceptar)
                    .addComponent(btlimpiar)
                    .addComponent(btcancelar))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaceptarActionPerformed
        super.save();
    }//GEN-LAST:event_btaceptarActionPerformed

    private void btlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarActionPerformed

        txtdni.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtempresa.setText("");


        // TODO add your handling code here:
    }//GEN-LAST:event_btlimpiarActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed

        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btcancelarActionPerformed

    private void tbdniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbdniKeyPressed
        Helper.enterKeyPressed(evt, tbnombre);
    }//GEN-LAST:event_tbdniKeyPressed

    private void tbdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbdniKeyTyped

    }//GEN-LAST:event_tbdniKeyTyped

    private void tbdniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbdniFocusGained

    }//GEN-LAST:event_tbdniFocusGained

    private void tbnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbnombreKeyPressed
        Helper.enterKeyPressed(evt, tbapellido);

    }//GEN-LAST:event_tbnombreKeyPressed

    private void tbapellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbapellidoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tbapellidoKeyReleased

    private void tbapellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbapellidoKeyPressed
        Helper.enterKeyPressed(evt, tbempresa);
    }//GEN-LAST:event_tbapellidoKeyPressed

    private void tbempresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbempresaKeyPressed
        Helper.enterKeyPressed(evt, tbdni);
    }//GEN-LAST:event_tbempresaKeyPressed

    @Override
    protected Cliente getValues()
    {
        this.cliente.setNombre(txtnombre.getText());
        this.cliente.setApellido(txtapellido.getText());
        this.cliente.setDni(Long.parseLong(txtdni.getText()));
        this.cliente.setEmpresa(txtempresa.getText());
        return cliente;
    }

     @Override
    protected void setValues()
    {
        this.tbapellido.setText(this.cliente.getApellido());
        this.tbdni.setText(String.valueOf( this.cliente.getDni()));
        this.tbempresa.setText(String.valueOf(this.cliente.getEmpresa()));
        this.tbnombre.setText(String.valueOf(this.cliente.getNombre()));
        
    }

    @Override
    protected EntidadNegocio getNegocio()
    {
        return this.ClienteNegocio;
    }




    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmcliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btaceptar;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btlimpiar;
    private javax.swing.JTextField tbapellido;
    private javax.swing.JTextField tbdni;
    private javax.swing.JTextField tbempresa;
    private javax.swing.JTextField tbnombre;
    private javax.swing.JLabel txtapellido;
    private javax.swing.JLabel txtdni;
    private javax.swing.JLabel txtempresa;
    private javax.swing.JLabel txtnombre;
    // End of variables declaration//GEN-END:variables

}