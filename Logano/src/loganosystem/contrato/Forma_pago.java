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
public class Forma_pago extends Entidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id_forma_pago;
    String nombre;

    public long getId_forma_pago() {
        return id_forma_pago;
    }

    public void setId_forma_pago(long id_forma_pago) {
        this.id_forma_pago = id_forma_pago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
