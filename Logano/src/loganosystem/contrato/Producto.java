/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loganosystem.contrato;

import java.awt.Image;
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
public class Producto extends Entidad implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id_producto;




    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getId_producto() {
        return id_producto;
    }

    public void setId_producto(long id_producto) {
        this.id_producto = id_producto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(long precio_unitario) {
        this.precio_unitario = precio_unitario;
    }
    long codigo;
    long precio_unitario;
    String nombre;
    String descripcion;
    String marca;
    String modelo;
    //Image imagen;
}
