


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loganosystem.negocio;

import loganosystem.contrato.Banco;
import loganosystem.contrato.Entidad;
import loganosystem.datos.BancoDatos;
import loganosystem.datos.PagosDatos;

/**
 *
 * @author loreh
 */
public class PagosNegocio extends EntidadNegocio {

    PagosDatos pagos = new PagosDatos();

    @Override
    public void save(Entidad pago){
        pagos.save(pago);
    }
}
