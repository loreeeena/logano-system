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
public class Permiso implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id_permiso;

    public long getId_permiso() {
        return id_permiso;
    }

    public void setId_permiso(long id_permiso) {
        this.id_permiso = id_permiso;
    }

    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    String nombre;
    long id_usuario;
}
