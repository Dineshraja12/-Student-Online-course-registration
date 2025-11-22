import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistrationSystem system = new RegistrationSystem();

        system.addCourse(new Course("C101", "Java Programming", 2));
        system.addCourse(new Course("C102", "Python Basics", 3));
        system.addCourse(new Course("C103", "Web Development", 1));

        System.out.println("Enter Student ID: ");
        String id = sc.nextLine();

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        Student s = new Student(id, name);

        System.out.println("\nAvailable Courses:");
        system.showCourses();

        System.out.println("\nEnter Course ID to Register: ");
        String cid = sc.nextLine();

        system.register(s, cid);
    }
}
