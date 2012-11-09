/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frmproveedor.java
 *
 * Created on 12/08/2011, 15:10:21
 */

package logano;

import loganosystem.contrato.Proveedor;
import util.Helper;

/**
 *
 * @author loreh
 */
public class Frmproveedor extends FrmBaseEdicion {


    Proveedor proveedor = new Proveedor();
    /** Creates new form Frmproveedor */
    public Frmproveedor() {
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

        btaceptar = new javax.swing.JButton();
        btlimpiar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        tbprovincia = new javax.swing.JTextField();
        tbcontacto = new javax.swing.JTextField();
        tbtelefono = new javax.swing.JTextField();
        tbempresa = new javax.swing.JTextField();
        txtmarca = new javax.swing.JLabel();
        tbdireccion = new javax.swing.JTextField();
        txtprovincia = new javax.swing.JLabel();
        txtempresa = new javax.swing.JLabel();
        txttelefono = new javax.swing.JLabel();
        txtcontacto = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JLabel();
        txtpais = new javax.swing.JLabel();
        txtcod_postal = new javax.swing.JLabel();
        txtcuit = new javax.swing.JLabel();
        txtnro_ingresos_brutos = new javax.swing.JLabel();
        tbpais = new javax.swing.JTextField();
        tbcod_postal = new javax.swing.JTextField();
        tbcuit = new javax.swing.JTextField();
        tbnro_ingresos_brutos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(logano.LoganoApp.class).getContext().getResourceMap(Frmproveedor.class);
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

        tbprovincia.setName("tbprovincia"); // NOI18N
        tbprovincia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbprovinciaKeyPressed(evt);
            }
        });

        tbcontacto.setName("tbcontacto"); // NOI18N
        tbcontacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbcontactoKeyPressed(evt);
            }
        });

        tbtelefono.setName("tbtelefono"); // NOI18N
        tbtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbtelefonoKeyPressed(evt);
            }
        });

        tbempresa.setName("tbempresa"); // NOI18N
        tbempresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbempresaKeyPressed(evt);
            }
        });

        txtmarca.setText(resourceMap.getString("txtmarca.text")); // NOI18N
        txtmarca.setName("txtmarca"); // NOI18N

        tbdireccion.setName("tbdireccion"); // NOI18N
        tbdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbdireccionKeyPressed(evt);
            }
        });

        txtprovincia.setText(resourceMap.getString("txtprovincia.text")); // NOI18N
        txtprovincia.setName("txtprovincia"); // NOI18N

        txtempresa.setText(resourceMap.getString("txtempresa.text")); // NOI18N
        txtempresa.setName("txtempresa"); // NOI18N

        txttelefono.setText(resourceMap.getString("txttelefono.text")); // NOI18N
        txttelefono.setName("txttelefono"); // NOI18N

        txtcontacto.setText(resourceMap.getString("txtcontacto.text")); // NOI18N
        txtcontacto.setName("txtcontacto"); // NOI18N

        txtdireccion.setText(resourceMap.getString("txtdireccion.text")); // NOI18N
        txtdireccion.setName("txtdireccion"); // NOI18N

        txtpais.setText(resourceMap.getString("txtpais.text")); // NOI18N
        txtpais.setName("txtpais"); // NOI18N

        txtcod_postal.setText(resourceMap.getString("txtcod_postal.text")); // NOI18N
        txtcod_postal.setName("txtcod_postal"); // NOI18N

        txtcuit.setText(resourceMap.getString("txtcuit.text")); // NOI18N
        txtcuit.setName("txtcuit"); // NOI18N

        txtnro_ingresos_brutos.setText(resourceMap.getString("txtnro_ingresos_brutos.text")); // NOI18N
        txtnro_ingresos_brutos.setName("txtnro_ingresos_brutos"); // NOI18N

        tbpais.setText(resourceMap.getString("tbpais.text")); // NOI18N
        tbpais.setName("tbpais"); // NOI18N
        tbpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbpaisActionPerformed(evt);
            }
        });
        tbpais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbpaisKeyPressed(evt);
            }
        });

        tbcod_postal.setText(resourceMap.getString("tbcod_postal.text")); // NOI18N
        tbcod_postal.setName("tbcod_postal"); // NOI18N
        tbcod_postal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbcod_postalKeyPressed(evt);
            }
        });

        tbcuit.setText(resourceMap.getString("tbcuit.text")); // NOI18N
        tbcuit.setName("tbcuit"); // NOI18N
        tbcuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbcuitKeyPressed(evt);
            }
        });

        tbnro_ingresos_brutos.setText(resourceMap.getString("tbnro_ingresos_brutos.text")); // NOI18N
        tbnro_ingresos_brutos.setName("tbnro_ingresos_brutos"); // NOI18N
        tbnro_ingresos_brutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbnro_ingresos_brutosKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtempresa)
                        .addComponent(txtcontacto)
                        .addComponent(txttelefono)
                        .addComponent(txtprovincia)
                        .addComponent(btaceptar, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(txtdireccion)
                    .addComponent(txtmarca))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbempresa, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(tbcontacto, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(tbtelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(tbprovincia, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(tbdireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btlimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btcancelar)))
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnro_ingresos_brutos)
                    .addComponent(txtcod_postal)
                    .addComponent(txtcuit)
                    .addComponent(txtpais))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbnro_ingresos_brutos, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(tbcod_postal)
                    .addComponent(tbcuit, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(tbpais))
                .addGap(525, 525, 525))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tbpais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tbcod_postal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcod_postal))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tbcuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcuit)))
                            .addComponent(txtpais))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbnro_ingresos_brutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnro_ingresos_brutos)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtempresa)
                            .addComponent(tbempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcontacto)
                            .addComponent(tbcontacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttelefono)
                            .addComponent(tbtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtprovincia)
                            .addComponent(tbprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmarca)
                    .addComponent(txtdireccion)
                    .addComponent(tbdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btaceptar)
                    .addComponent(btlimpiar)
                    .addComponent(btcancelar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaceptarActionPerformed
        super.save();
    }//GEN-LAST:event_btaceptarActionPerformed

    private void btlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarActionPerformed
        txtcontacto.setText("");
        txtdireccion.setText("");
        txtempresa.setText("");
        txtprovincia.setText("");
        txttelefono.setText("");

    }//GEN-LAST:event_btlimpiarActionPerformed

    @Override
    protected Proveedor getValues()
    {
        this.proveedor.setCod_post(tbcod_postal.getText());
        this.proveedor.setContacto(tbcontacto.getText());
        this.proveedor.setCuit(txtcuit.getText());
        this.proveedor.setDireccion(tbdireccion.getText());
        this.proveedor.setEmpresa(tbempresa.getText());
        this.proveedor.setNro_ingresos_brutos(tbnro_ingresos_brutos.getText());
        this.proveedor.setPais(tbpais.getText());
        this.proveedor.setProvincia(tbprovincia.getText());
        this.proveedor.setTelefono(tbtelefono.getText());
        return proveedor;
    }

    @Override
    protected void setValues()
    {
        this.tbcod_postal.setText(this.proveedor.getCod_post());
        this.tbcontacto.setText(this.proveedor.getContacto());
        this.tbcuit.setText(this.proveedor.getCuit());
        this.tbdireccion.setText(this.proveedor.getDireccion());
        this.tbempresa.setText(this.proveedor.getEmpresa());
        this.tbnro_ingresos_brutos.setText(this.proveedor.getNro_ingresos_brutos());
        this.tbpais.setText(this.proveedor.getPais());
        this.tbprovincia.setText(this.proveedor.getProvincia());
        this.tbprovincia.setText(this.proveedor.getTelefono());

    }

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btcancelarActionPerformed

    private void tbpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbpaisActionPerformed
     
    }//GEN-LAST:event_tbpaisActionPerformed

    private void tbempresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbempresaKeyPressed
         Helper.enterKeyPressed(evt, tbcontacto);
    }//GEN-LAST:event_tbempresaKeyPressed

    private void tbcontactoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbcontactoKeyPressed
        Helper.enterKeyPressed(evt, tbtelefono);
    }//GEN-LAST:event_tbcontactoKeyPressed

    private void tbtelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbtelefonoKeyPressed
         Helper.enterKeyPressed(evt, tbprovincia);
    }//GEN-LAST:event_tbtelefonoKeyPressed

    private void tbprovinciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbprovinciaKeyPressed
         Helper.enterKeyPressed(evt, tbdireccion);
    }//GEN-LAST:event_tbprovinciaKeyPressed

    private void tbdireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbdireccionKeyPressed
         Helper.enterKeyPressed(evt, tbpais);
    }//GEN-LAST:event_tbdireccionKeyPressed

    private void tbpaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbpaisKeyPressed
         Helper.enterKeyPressed(evt, tbcod_postal);
    }//GEN-LAST:event_tbpaisKeyPressed

    private void tbcod_postalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbcod_postalKeyPressed
         Helper.enterKeyPressed(evt, tbcuit);
    }//GEN-LAST:event_tbcod_postalKeyPressed

    private void tbcuitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbcuitKeyPressed
       Helper.enterKeyPressed(evt, tbnro_ingresos_brutos);
    }//GEN-LAST:event_tbcuitKeyPressed

    private void tbnro_ingresos_brutosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbnro_ingresos_brutosKeyPressed
         Helper.enterKeyPressed(evt, tbempresa);
    }//GEN-LAST:event_tbnro_ingresos_brutosKeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmproveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btaceptar;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btlimpiar;
    private javax.swing.JTextField tbcod_postal;
    private javax.swing.JTextField tbcontacto;
    private javax.swing.JTextField tbcuit;
    private javax.swing.JTextField tbdireccion;
    private javax.swing.JTextField tbempresa;
    private javax.swing.JTextField tbnro_ingresos_brutos;
    private javax.swing.JTextField tbpais;
    private javax.swing.JTextField tbprovincia;
    private javax.swing.JTextField tbtelefono;
    private javax.swing.JLabel txtcod_postal;
    private javax.swing.JLabel txtcontacto;
    private javax.swing.JLabel txtcuit;
    private javax.swing.JLabel txtdireccion;
    private javax.swing.JLabel txtempresa;
    private javax.swing.JLabel txtmarca;
    private javax.swing.JLabel txtnro_ingresos_brutos;
    private javax.swing.JLabel txtpais;
    private javax.swing.JLabel txtprovincia;
    private javax.swing.JLabel txttelefono;
    // End of variables declaration//GEN-END:variables

}
