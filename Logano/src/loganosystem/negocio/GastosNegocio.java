


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loganosystem.negocio;

import loganosystem.contrato.Banco;
import loganosystem.contrato.Entidad;
import loganosystem.datos.BancoDatos;
import loganosystem.datos.GastosDatos;

/**
 *
 * @author loreh
 */
public class GastosNegocio extends EntidadNegocio {

    GastosDatos gastos = new GastosDatos();

    @Override
    public void save(Entidad gasto){
        gastos.save(gasto);
    }
}
