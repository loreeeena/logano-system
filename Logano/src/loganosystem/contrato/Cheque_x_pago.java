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
public class Cheque_x_pago extends Entidad implements Serializable {
     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
    long id_cheque_pago;
    long id_cheque;
    long id_pago;

    public long getId_cheque() {
        return id_cheque;
    }

    public void setId_cheque(long id_cheque) {
        this.id_cheque = id_cheque;
    }

    public long getId_cheque_pago() {
        return id_cheque_pago;
    }

    public void setId_cheque_pago(long id_cheque_pago) {
        this.id_cheque_pago = id_cheque_pago;
    }

    public long getId_pago() {
        return id_pago;
    }

    public void setId_pago(long id_pago) {
        this.id_pago = id_pago;
    }


}
