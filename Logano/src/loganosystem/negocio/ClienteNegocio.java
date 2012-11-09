


package loganosystem.negocio;

import loganosystem.contrato.Banco;
import loganosystem.contrato.Entidad;
import loganosystem.datos.BancoDatos;
import loganosystem.datos.ClienteDatos;

/**
 *
 * @author loreh
 */
public class ClienteNegocio extends EntidadNegocio {

    ClienteDatos clienteDatos = new ClienteDatos();

    @Override
    public void save(Entidad cliente){
        clienteDatos.save(cliente);
    }
}