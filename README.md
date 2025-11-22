Online Course Registration System (Java + Hibernate)

A simple console-based Java project using Hibernate ORM for managing students, courses, and registrations. No Spring, no UI — fully backend + console.


---

✅ Features

Add Student

Add Course

List All Students

List All Courses

Register Student to Course

Prevent Duplicate Registrations

Course Seat Limit Checking

View All Registrations

Auto Timestamp for Registration

Uses MySQL Database

Simple Console Interface



---

🛠 Technologies Used

Java 17+

Hibernate 6

MySQL Database

Maven

Console-based



---

⚙️ Setup Instructions

1. MySQL Setup

CREATE DATABASE course_db;

Username/password same as in hibernate.cfg.xml (root/root)

Hibernate auto-creates tables Student, Course, Registration


2. Import Project

Open project folder in any IDE (Eclipse, IntelliJ, VS Code)

Ensure Hibernate & MySQL connector JARs are included


3. Run Application

Run Main.java

Follow console prompts to add students, courses, and register



---

🎮 Console Menu / Flow

Enter Student ID & Name

Add Courses manually in code or via Hibernate session

List Courses

Register student by entering Course ID

Seats decrease automatically

Shows success/failure messages



---

📦 Entities

Student

studentId

name


Course

courseId

name

seats


Registration

id

studentId

courseId



---

🧪 Sample Flow

Enter Student ID: S101
Enter Name: Arun
Enter Course ID to Register: C101
Registered Successfully!


---

🤝 Contributions

Pull requests are welcome.


---

📌 License

MIT License


---

👤 Author

Dinesh Raja
