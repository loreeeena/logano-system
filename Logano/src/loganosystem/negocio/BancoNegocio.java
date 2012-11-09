/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loganosystem.negocio;

import java.util.ArrayList;
import loganosystem.contrato.Banco;
import loganosystem.contrato.Entidad;
import loganosystem.datos.BancoDatos;

/**
 *
 * @author loreh
 */
public class BancoNegocio extends EntidadNegocio {

    BancoDatos bancoDatos = new BancoDatos();

    @Override
    public void save(Entidad banco){
        bancoDatos.save(banco);
    }

    @Override
    public ArrayList<Entidad> getAll(){
        return bancoDatos.getAll();
    }
}
