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
 */@Entity
public class Cheque extends Entidad implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id_cheque;
    long nro_cheque;
    double importe;
    long id_banco;
    String descripcion;

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

    public long getId_cheque() {
        return id_cheque;
    }

    public void setId_cheque(long id_cheque) {
        this.id_cheque = id_cheque;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public long getNro_cheque() {
        return nro_cheque;
    }

    public void setNro_cheque(long nro_cheque) {
        this.nro_cheque = nro_cheque;
    }
}
