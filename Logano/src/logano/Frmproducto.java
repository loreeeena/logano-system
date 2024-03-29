/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frmproducto.java
 *
 * Created on 29/05/2011, 13:58:16
 */

package logano;

import loganosystem.contrato.Producto;
import util.Helper;

/**
 *
 * @author loreh
 */
public class Frmproducto extends FrmBaseEdicion {

      Producto producto = new Producto();
    /** Creates new form Frmproducto */
    public Frmproducto() {
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

        txtcodigo = new javax.swing.JLabel();
        txtprecio_unitario = new javax.swing.JLabel();
        txtnombre = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JLabel();
        txtmarca = new javax.swing.JLabel();
        txtmodelo = new javax.swing.JLabel();
        btaceptar = new javax.swing.JButton();
        btlimpiar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        tbcodigo = new javax.swing.JTextField();
        tbprecio_unit = new javax.swing.JTextField();
        tbnombre = new javax.swing.JTextField();
        tbdescripcion = new javax.swing.JTextField();
        tbmarca = new javax.swing.JTextField();
        tbmodelo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(logano.LoganoApp.class).getContext().getResourceMap(Frmproducto.class);
        txtcodigo.setText(resourceMap.getString("txtcodigo.text")); // NOI18N
        txtcodigo.setName("txtcodigo"); // NOI18N

        txtprecio_unitario.setText(resourceMap.getString("txtprecio_unitario.text")); // NOI18N
        txtprecio_unitario.setName("txtprecio_unitario"); // NOI18N

        txtnombre.setText(resourceMap.getString("txtnombre.text")); // NOI18N
        txtnombre.setName("txtnombre"); // NOI18N

        txtdescripcion.setText(resourceMap.getString("txtdescripcion.text")); // NOI18N
        txtdescripcion.setName("txtdescripcion"); // NOI18N

        txtmarca.setText(resourceMap.getString("txtmarca.text")); // NOI18N
        txtmarca.setName("txtmarca"); // NOI18N

        txtmodelo.setText(resourceMap.getString("txtmodelo.text")); // NOI18N
        txtmodelo.setName("txtmodelo"); // NOI18N

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

        tbcodigo.setText(resourceMap.getString("tbcodigo.text")); // NOI18N
        tbcodigo.setName("tbcodigo"); // NOI18N
        tbcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbcodigoKeyPressed(evt);
            }
        });

        tbprecio_unit.setText(resourceMap.getString("tbprecio_unit.text")); // NOI18N
        tbprecio_unit.setName("tbprecio_unit"); // NOI18N
        tbprecio_unit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbprecio_unitKeyPressed(evt);
            }
        });

        tbnombre.setText(resourceMap.getString("tbnombre.text")); // NOI18N
        tbnombre.setName("tbnombre"); // NOI18N
        tbnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbnombreKeyPressed(evt);
            }
        });

        tbdescripcion.setText(resourceMap.getString("tbdescripcion.text")); // NOI18N
        tbdescripcion.setName("tbdescripcion"); // NOI18N
        tbdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbdescripcionKeyPressed(evt);
            }
        });

        tbmarca.setText(resourceMap.getString("tbmarca.text")); // NOI18N
        tbmarca.setName("tbmarca"); // NOI18N
        tbmarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbmarcaKeyPressed(evt);
            }
        });

        tbmodelo.setText(resourceMap.getString("tbmodelo.text")); // NOI18N
        tbmodelo.setName("tbmodelo"); // NOI18N
        tbmodelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbmodeloKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcodigo)
                            .addComponent(txtprecio_unitario)
                            .addComponent(txtnombre)
                            .addComponent(txtdescripcion)
                            .addComponent(txtmodelo))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(tbprecio_unit, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(tbnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(tbdescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(tbmarca, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(tbmodelo, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                    .addComponent(txtmarca, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(btcancelar)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigo)
                    .addComponent(tbcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprecio_unitario)
                    .addComponent(tbprecio_unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre)
                    .addComponent(tbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdescripcion)
                    .addComponent(tbdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmarca)
                    .addComponent(tbmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmodelo))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btlimpiar)
                    .addComponent(btaceptar)
                    .addComponent(btcancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaceptarActionPerformed
        super.save();
    }//GEN-LAST:event_btaceptarActionPerformed

    private void btlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarActionPerformed

        txtcodigo.setText("");
        txtprecio_unitario.setText("");
        txtnombre.setText("");
        txtdescripcion.setText("");
        txtmarca.setText("");
        txtmodelo.setText("");


    }//GEN-LAST:event_btlimpiarActionPerformed

     @Override
    protected Producto getValues()
    {
        this.producto.setCodigo(Long.parseLong(tbcodigo.getText()));
        this.producto.setDescripcion(tbdescripcion.getText());
        this.producto.setPrecio_unitario(Long.parseLong(tbprecio_unit.getText()));
        this.producto.setMarca(tbmarca.getText());
        this.producto.setModelo(tbmodelo.getText());
        this.producto.setNombre(tbnombre.getText());
        return producto;
    }

     @Override
    protected void setValues()
    {
        this.tbdescripcion.setText(this.producto.getDescripcion());
        this.tbcodigo.setText(String.valueOf( this.producto.getCodigo()));
        this.tbprecio_unit.setText(String.valueOf(this.producto.getPrecio_unitario()));
        this.tbmarca.setText(this.producto.getMarca());
        this.tbmodelo.setText(this.producto.getModelo());
        this.tbnombre.setText(this.producto.getNombre());

    }





    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed

        dispose();
    }//GEN-LAST:event_btcancelarActionPerformed

    private void tbcodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbcodigoKeyPressed
        Helper.enterKeyPressed(evt, tbprecio_unit);
    }//GEN-LAST:event_tbcodigoKeyPressed

    private void tbprecio_unitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbprecio_unitKeyPressed
         Helper.enterKeyPressed(evt, tbnombre);

    }//GEN-LAST:event_tbprecio_unitKeyPressed

    private void tbnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbnombreKeyPressed
        Helper.enterKeyPressed(evt, tbdescripcion);

    }//GEN-LAST:event_tbnombreKeyPressed

    private void tbdescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbdescripcionKeyPressed
       Helper.enterKeyPressed(evt, tbmarca);
    }//GEN-LAST:event_tbdescripcionKeyPressed

    private void tbmarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbmarcaKeyPressed
       Helper.enterKeyPressed(evt, tbmodelo);
    }//GEN-LAST:event_tbmarcaKeyPressed

    private void tbmodeloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbmodeloKeyPressed
        Helper.enterKeyPressed(evt, tbcodigo);
    }//GEN-LAST:event_tbmodeloKeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmproducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btaceptar;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btlimpiar;
    private javax.swing.JTextField tbcodigo;
    private javax.swing.JTextField tbdescripcion;
    private javax.swing.JTextField tbmarca;
    private javax.swing.JTextField tbmodelo;
    private javax.swing.JTextField tbnombre;
    private javax.swing.JTextField tbprecio_unit;
    private javax.swing.JLabel txtcodigo;
    private javax.swing.JLabel txtdescripcion;
    private javax.swing.JLabel txtmarca;
    private javax.swing.JLabel txtmodelo;
    private javax.swing.JLabel txtnombre;
    private javax.swing.JLabel txtprecio_unitario;
    // End of variables declaration//GEN-END:variables

}
