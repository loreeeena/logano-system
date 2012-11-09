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
public class Gastos extends Entidad implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id_gasto;
    String razon_social;
    long importe;
    long id_comprobante;

    public long getId_comprobante() {
        return id_comprobante;
    }

    public void setId_comprobante(long id_comprobante) {
        this.id_comprobante = id_comprobante;
    }

    public long getId_gasto() {
        return id_gasto;
    }

    public void setId_gasto(long id_gasto) {
        this.id_gasto = id_gasto;
    }

    public long getImporte() {
        return importe;
    }

    public void setImporte(long importe) {
        this.importe = importe;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }
}
