import jakarta.persistence.*;

@Entity
public class Course {

    @Id
    private String courseId;

    private String name;
    private int seats;

    public Course() {}

    public Course(String courseId, String name, int seats) {
        this.courseId = courseId;
        this.name = name;
        this.seats = seats;
    }

    public boolean register() {
        if (seats > 0) {
            seats--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return courseId + " - " + name + " (Seats: " + seats + ")";
    }
}
