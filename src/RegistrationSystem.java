import java.util.*;

public class RegistrationSystem {

    private List<Course> courses = new ArrayList<>();
    private Map<String, List<Course>> registrations = new HashMap<>();

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void showCourses() {
        for (Course c : courses) {
            System.out.println(c);
        }
    }

    public void register(Student s, String courseId) {
        for (Course c : courses) {
            if (c.getCourseId().equals(courseId)) {
                if (c.register()) {
                    registrations.putIfAbsent(s.getStudentId(), new ArrayList<>());
                    registrations.get(s.getStudentId()).add(c);
                    System.out.println("Registered successfully!");
                } else {
                    System.out.println("No seats available!");
                }
                return;
            }
        }
        System.out.println("Invalid Course ID!");
    }
}
