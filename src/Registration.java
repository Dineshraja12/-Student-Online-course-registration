import jakarta.persistence.*;

@Entity
public class Registration {

    @Id
    @GeneratedValue
    private int id;

    private String studentId;
    private String courseId;

    public Registration() {}

    public Registration(String studentId, String courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }
}
