



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loganosystem.negocio;

import loganosystem.contrato.Banco;
import loganosystem.contrato.Entidad;
import loganosystem.datos.BancoDatos;
import loganosystem.datos.Formas_de_pagoDatos;

/**
 *
 * @author loreh
 */
public class Formas_de_pagNegocio extends EntidadNegocio {

    Formas_de_pagoDatos fpagos = new Formas_de_pagoDatos();

    @Override
    public void save(Entidad fpagoss){
        fpagos.save(fpagoss);
    }
}
