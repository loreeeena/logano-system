/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loganosystem.contrato;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;

/**
 *
 * @author miguel
 */
@Entity
public class Comprobante extends Entidad implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id_comprobante;
    long nro_comprobante;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date fecha_emision;
    long id_proveedor;
    long id_cliente;
    long id_tipo_comprobante;
    long id_gastos;
    boolean cancelado;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date fecha_cancelado;

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public Date getFecha_cancelado() {
        return fecha_cancelado;
    }

    public void setFecha_cancelado(Date fecha_cancelado) {
        this.fecha_cancelado = fecha_cancelado;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public long getId_comprobante() {
        return id_comprobante;
    }

    public void setId_comprobante(long id_comprobante) {
        this.id_comprobante = id_comprobante;
    }

    public long getId_gastos() {
        return id_gastos;
    }

    public void setId_gastos(long id_gastos) {
        this.id_gastos = id_gastos;
    }

    public long getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(long id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public long getId_tipo_comprobante() {
        return id_tipo_comprobante;
    }

    public void setId_tipo_comprobante(long id_tipo_comprobante) {
        this.id_tipo_comprobante = id_tipo_comprobante;
    }

    public long getNro_comprobante() {
        return nro_comprobante;
    }

    public void setNro_comprobante(long nro_comprobante) {
        this.nro_comprobante = nro_comprobante;
    }


}
