package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.utils.HibernateUtil;

public class HibernateClientTest {

    public static void main(String[] args) {
        /*Session session = null;
        SessionFactory sessionFactory = null;
        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            String SQL = "select version()";
            String version = (String) session.createNativeQuery(SQL).getSingleResult();
            System.out.println("MYSql Version : " + version);
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
                sessionFactory.close();
            }
        }*/

        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession()) {
            String SQL = "select version()";
            String version = (String) session.createNativeQuery(SQL).getSingleResult();
            System.out.println("MYSql Version : " + version);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}






