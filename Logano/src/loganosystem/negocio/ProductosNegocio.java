


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loganosystem.negocio;

import loganosystem.contrato.Banco;
import loganosystem.contrato.Entidad;
import loganosystem.datos.BancoDatos;
import loganosystem.datos.ProductosDatos;

/**
 *
 * @author loreh
 */
public class ProductosNegocio extends EntidadNegocio {

    ProductosDatos producto = new ProductosDatos();

    @Override
    public void save(Entidad prod){
        producto.save(prod);
    }
}
