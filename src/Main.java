import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        // Add sample courses
        session.save(new Course("C101", "Java Programming", 2));
        session.save(new Course("C102", "Python Basics", 3));
        session.save(new Course("C103", "Web Development", 1));

        tx.commit();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID: ");
        String sid = sc.nextLine();

        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        session.beginTransaction();
        session.save(new Student(sid, name));
        session.getTransaction().commit();

        System.out.println("Enter Course ID to Register: ");
        String cid = sc.nextLine();

        session.beginTransaction();
        Course c = session.get(Course.class, cid);

        if (c != null && c.register()) {
            session.update(c);
            session.save(new Registration(sid, cid));
            System.out.println("Registered Successfully!");
        } else {
            System.out.println("No seats / Invalid course!");
        }

        session.getTransaction().commit();
        session.close();
    }
}
