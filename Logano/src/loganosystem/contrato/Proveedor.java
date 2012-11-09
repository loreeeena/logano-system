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
public class Proveedor extends Entidad implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id_proveedor;
    String empresa;
    String contacto;
    String telefono;
    String direccion;
    String provincia;

    public String getCod_post() {
        return cod_post;
    }

    public void setCod_post(String cod_post) {
        this.cod_post = cod_post;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public long getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(long id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNro_ingresos_brutos() {
        return nro_ingresos_brutos;
    }

    public void setNro_ingresos_brutos(String nro_ingresos_brutos) {
        this.nro_ingresos_brutos = nro_ingresos_brutos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    String pais;
    String cod_post;
    String cuit;
    String nro_ingresos_brutos;
}
