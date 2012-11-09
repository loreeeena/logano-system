


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loganosystem.negocio;

import loganosystem.contrato.Banco;
import loganosystem.contrato.Entidad;
import loganosystem.datos.BancoDatos;
import loganosystem.datos.CuentaBancariaDatos;

/**
 *
 * @author loreh
 */
public class Cuenta_BancNegocio extends EntidadNegocio {

    CuentaBancariaDatos cuentab = new CuentaBancariaDatos();

    @Override
    public void save(Entidad cuentaban){
        cuentab.save(cuentaban);
    }
}
