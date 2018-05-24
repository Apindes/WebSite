package entities;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

/**
 *
 * @author максим
 */
public class HibernateUtil {
    
    private static final SessionFactory sessionFactory;
    static{
        try{
            sessionFactory=new Configuration().buildSessionFactory();
        }catch(Throwable ex){
            System.err.println("Initial SessionFactory creation failed." + ex);
        throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    
}
