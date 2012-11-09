/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package loganosystem.datos;

import java.util.ArrayList;
import loganosystem.contrato.Entidad;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.Query;

/**
 *
 * @author loreh
 */
public class EntidadDatos {

    public ArrayList<Entidad> getAll (){

        Session session = init();
        Query query = session.createQuery("from " + "Banco");
        return (ArrayList<Entidad>) query.list();
    }

    public void save(Entidad entidad){

       Session session = init();

       session.save(entidad);
       session.flush();
       session.close();

    }

    private Session init() throws HibernateException {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
    }
}
