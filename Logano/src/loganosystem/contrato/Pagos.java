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
public class Pagos extends Entidad implements Serializable {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
    long id_pago;
    double importe;
    long id_tarjeta;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getId_banco() {
        return id_banco;
    }

    public void setId_banco(long id_banco) {
        this.id_banco = id_banco;
    }

    public long getId_pago() {
        return id_pago;
    }

    public void setId_pago(long id_pago) {
        this.id_pago = id_pago;
    }

    public long getId_tarjeta() {
        return id_tarjeta;
    }

    public void setId_tarjeta(long id_tarjeta) {
        this.id_tarjeta = id_tarjeta;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    long id_banco;
    String descripcion;
}
