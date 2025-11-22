public class Course {
    private String courseId;
    private String courseName;
    private int seats;

    public Course(String courseId, String courseName, int seats) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.seats = seats;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
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
        return courseId + " - " + courseName + " (Seats: " + seats + ")";
    }
}
