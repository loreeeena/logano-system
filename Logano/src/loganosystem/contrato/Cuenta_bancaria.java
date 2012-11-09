/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loganosystem.contrato;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;

/**
 *
 * @author miguel
 */
@Entity
public class Cuenta_bancaria extends Entidad implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id_cuenta_bancaria;
    long nro_cuenta;
    long id_banco;
    double saldo;

    public long getId_banco() {
        return id_banco;
    }

    public void setId_banco(long id_banco) {
        this.id_banco = id_banco;
    }

    public long getId_cuenta_bancaria() {
        return id_cuenta_bancaria;
    }

    public void setId_cuenta_bancaria(long id_cuenta_bancaria) {
        this.id_cuenta_bancaria = id_cuenta_bancaria;
    }

    public long getNro_cuenta() {
        return nro_cuenta;
    }

    public void setNro_cuenta(long nro_cuenta) {
        this.nro_cuenta = nro_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNro_cuenta(String text) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void setSaldo(String text) {
        throw new UnsupportedOperationException("Not yet implemented");
    }


}
