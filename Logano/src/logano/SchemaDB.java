package logano;

import loganosystem.contrato.*;
import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author loreh
 */
public class SchemaDB {

    public static void generate_schema() throws MappingException, HibernateException {
        AnnotationConfiguration config = new AnnotationConfiguration();
        config.addAnnotatedClass(Banco.class);
        config.addAnnotatedClass(Usuario.class);
        config.addAnnotatedClass(Factura_item.class);
        config.addAnnotatedClass(Cheque.class);
        config.addAnnotatedClass(Comprobante.class);
        config.addAnnotatedClass(Cuenta_bancaria.class);
        config.addAnnotatedClass(Forma_pago.class);
        config.addAnnotatedClass(Gastos.class);
        config.addAnnotatedClass(Pagos.class);
        config.addAnnotatedClass(Permiso.class);
        config.addAnnotatedClass(Producto.class);
        config.addAnnotatedClass(Proveedor_x_producto.class);
        config.addAnnotatedClass(Stock.class);
        config.addAnnotatedClass(Tarjeta.class);
        config.addAnnotatedClass(Tipo_comprobante.class);
        config.configure();
        new SchemaExport(config).create(true, true);
        SchemaExport schema = new SchemaExport(config);
        schema.setOutputFile("/home/loreh/schema.sql");
        schema.create(true, true);

    }

    public static void test_hibernate()
    {
        Banco banco = new Banco();
        banco.setDireccion("dsds");
        banco.setNombre("dsds");

        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.save(banco);
        session.flush();
        session.close();
    }
}
