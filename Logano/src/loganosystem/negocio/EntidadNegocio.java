/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loganosystem.negocio;
import java.util.ArrayList;
import loganosystem.contrato.Entidad;
import loganosystem.datos.BancoDatos;
import loganosystem.datos.EntidadDatos;

/**
 *
 * @author loreh
 */
public class EntidadNegocio {

    protected EntidadDatos entidadDatos;

    public void save(Entidad entidad) {
        this.entidadDatos.save(entidad);
    }

    public ArrayList<Entidad> getAll(){
        return this.entidadDatos.getAll();
    }

}
