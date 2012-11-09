


package loganosystem.negocio;

import loganosystem.contrato.Banco;
import loganosystem.contrato.Entidad;
import loganosystem.datos.BancoDatos;
import loganosystem.datos.ComprobanteDatos;

/**
 *
 * @author loreh
 */
public class ComprobanteNegocio extends EntidadNegocio {

    ComprobanteDatos comprobantedatos = new ComprobanteDatos();

    @Override
    public void save(Entidad comprobante){
        comprobantedatos.save(comprobante);
    }
}