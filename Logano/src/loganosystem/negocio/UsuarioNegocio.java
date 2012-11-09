


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loganosystem.negocio;

import loganosystem.contrato.Banco;
import loganosystem.contrato.Entidad;
import loganosystem.datos.BancoDatos;
import loganosystem.datos.UsuarioDatos;

/**
 *
 * @author loreh
 */
public class UsuarioNegocio extends EntidadNegocio {

    UsuarioDatos usuario = new UsuarioDatos();

    @Override
    public void save(Entidad usu){
        usuario.save(usu);
    }
}
