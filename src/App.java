import dao.*;
import model.*;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        StudentDAO sdao = new StudentDAO();
        CourseDAO cdao = new CourseDAO();
        RegistrationDAO rdao = new RegistrationDAO();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== ONLINE COURSE REGISTRATION ===");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. List Students");
            System.out.println("4. List Courses");
            System.out.println("5. Register Student to Course");
            System.out.println("6. Show Registrations");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {

                case 1 -> {
                    System.out.print("Student Name: ");
                    sc.nextLine(); 
                    String name = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    Student s = new Student();
                    s.setName(name);
                    s.setEmail(email);
                    sdao.save(s);

                    System.out.println("✔ Student Added!");
                }

                case 2 -> {
                    System.out.print("Course Title: ");
                    sc.nextLine();
                    String title = sc.nextLine();

                    System.out.print("Seats: ");
                    int seats = sc.nextInt();

                    Course c = new Course();
                    c.setTitle(title);
                    c.setSeats(seats);
                    cdao.save(c);

                    System.out.println("✔ Course Added!");
                }

                case 3 -> {
                    System.out.println("\n--- Students ---");
                    sdao.list().forEach(System.out::println);
                }

                case 4 -> {
                    System.out.println("\n--- Courses ---");
                    cdao.list().forEach(System.out::println);
                }

                case 5 -> {
                    System.out.print("Student ID: ");
                    int sid = sc.nextInt();
                    System.out.print("Course ID: ");
                    int cid = sc.nextInt();

                    Student s = sdao.get(sid);
                    Course c = cdao.get(cid);

                    if (s == null || c == null) {
                        System.out.println("❌ Invalid student or course!");
                        break;
                    }

                    rdao.register(s, c);
                }

                case 6 -> {
                    System.out.println("\n--- Registrations ---");
                    rdao.list().forEach(System.out::println);
                }

                case 0 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
