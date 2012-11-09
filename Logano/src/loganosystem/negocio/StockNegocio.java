


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loganosystem.negocio;

import loganosystem.contrato.Banco;
import loganosystem.contrato.Entidad;
import loganosystem.datos.BancoDatos;
import loganosystem.datos.StockDatos;

/**
 *
 * @author loreh
 */
public class StockNegocio extends EntidadNegocio {

     StockDatos stock = new StockDatos();

    @Override
    public void save(Entidad st){
        stock.save(st);
    }
}
