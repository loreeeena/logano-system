


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loganosystem.negocio;

import loganosystem.contrato.Banco;
import loganosystem.contrato.Entidad;
import loganosystem.datos.BancoDatos;
import loganosystem.datos.ProveedorDatos;

/**
 *
 * @author loreh
 */
public class ProveedorNegocio extends EntidadNegocio {

     ProveedorDatos proveedor = new ProveedorDatos();

    @Override
    public void save(Entidad prov){
        proveedor.save(prov);
    }
}
