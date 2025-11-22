import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    private String studentId;

    private String name;

    public Student() {}

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
}
