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
public class Banco extends Entidad implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id_banco;
    private String nombre;
    private String codigo;

    public Banco(long id_banco, String nombre, String direccion) {
        this.id_banco = id_banco;
        this.nombre = nombre;
        this.codigo = direccion;
    }

    public Banco() {
    }

    public String getDireccion() {
        return codigo;
    }

    public void setDireccion(String direccion) {
        this.codigo = direccion;
    }

    public long getId_banco() {
        return id_banco;
    }

    public void setId_banco(long id_banco) {
        this.id_banco = id_banco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
