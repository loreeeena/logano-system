


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loganosystem.negocio;

import loganosystem.contrato.Banco;
import loganosystem.contrato.Entidad;
import loganosystem.datos.BancoDatos;
import loganosystem.datos.Tipo_de_comprobantesDatos;

/**
 *
 * @author loreh
 */
public class Tipo_compNegocio extends EntidadNegocio {

    Tipo_de_comprobantesDatos tcomprobante = new Tipo_de_comprobantesDatos();

    @Override
    public void save(Entidad tcomp){
        tcomprobante.save(tcomp);
    }
}
