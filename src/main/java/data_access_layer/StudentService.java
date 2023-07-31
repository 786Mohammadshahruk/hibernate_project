package data_access_layer;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.utils.HibernateUtil;

public class StudentService {

    public static void main(String[] args) {

        Session session = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();

            session.persist(getStudent());

            transaction.commit();

        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    private static Student getStudent() {
        Student student = new Student();
        student.setFirstName("Amit_1");

        student.setLastName("Mishra");
        student.setEmail("amit.mishra@gmail.com");
        return student;
    }
}
