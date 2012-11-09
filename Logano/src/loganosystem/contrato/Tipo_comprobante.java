
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
public class Tipo_comprobante extends Entidad implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id_tipo_comprobante;

    public long getId_tipo_comprobante() {
        return id_tipo_comprobante;
    }

    public void setId_tipo_comprobante(long id_tipo_comprobante) {
        this.id_tipo_comprobante = id_tipo_comprobante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    String nombre;
}
