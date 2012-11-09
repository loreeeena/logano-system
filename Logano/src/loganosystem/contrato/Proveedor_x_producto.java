/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loganosystem.contrato;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author miguel
 */
@Entity
public class Proveedor_x_producto implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id_proveedor_producto;

    public long getId_producto() {
        return id_producto;
    }

    public void setId_producto(long id_producto) {
        this.id_producto = id_producto;
    }

    public long getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(long id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public long getId_proveedor_producto() {
        return id_proveedor_producto;
    }

    public void setId_proveedor_producto(long id_proveedor_producto) {
        this.id_proveedor_producto = id_proveedor_producto;
    }
    long id_proveedor;
    long id_producto;
}
