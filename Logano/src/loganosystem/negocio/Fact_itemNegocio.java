



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loganosystem.negocio;

import loganosystem.contrato.Banco;
import loganosystem.contrato.Entidad;
import loganosystem.datos.BancoDatos;
import loganosystem.datos.Factura_ItemDatos;

/**
 *
 * @author loreh
 */
public class Fact_itemNegocio extends EntidadNegocio {

    Factura_ItemDatos fitem = new Factura_ItemDatos();

    @Override
    public void save(Entidad Fact_item){
        fitem.save(Fact_item);
    }
}
