package practice.hiber2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session sess= sf.openSession();
        
        sess.beginTransaction();
        
        Employee emp = new Employee("Akhul", 40000, "Assosiate", "Tester");
        sess.persist(emp);
        
        sess.getTransaction().commit();
    }
}
