


package loganosystem.negocio;

import loganosystem.contrato.Banco;
import loganosystem.contrato.Entidad;
import loganosystem.datos.BancoDatos;
import loganosystem.datos.ChequeDatos;

/**
 *
 * @author loreh
 */
public class ChequeNegocio extends EntidadNegocio {

    ChequeDatos chequeDatos = new ChequeDatos();

    @Override
    public void save(Entidad cheque){
        chequeDatos.save(cheque);
    }
}