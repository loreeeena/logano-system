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
public class Factura_item extends Entidad implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id_factura_item;
    long id_producto;
    double precio_unitario;
    long cantidad;

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public long getId_factura_item() {
        return id_factura_item;
    }

    public void setId_factura_item(long id_factura_item) {
        this.id_factura_item = id_factura_item;
    }

    public long getId_producto() {
        return id_producto;
    }

    public void setId_producto(long id_producto) {
        this.id_producto = id_producto;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public void setPrecio_unitario(String text) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
