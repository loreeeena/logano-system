/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loganosystem.contrato;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Entity;import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
;

/**
 *
 * @author miguel
 */
@Entity
public class Tarjeta extends Entidad implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id_tarjeta;

    public long getId_tarjeta() {
        return id_tarjeta;
    }

    public void setId_tarjeta(long id_tarjeta) {
        this.id_tarjeta = id_tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    String nombre;
}
