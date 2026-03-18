package lexicon.exercises;

public class Student {
   /* Create a Student class.
    Add the required fields (e.g., studentId, name, age, major).
    Apply encapsulation by making all fields private.
    Use:
    Constructors to initialize student data
    Getters to access field values
    Setters to update field values safely
    Create multiple Student objects with different data.
    Show that each object represents a unique student.
    Create a UML class diagram for the Student class.*/
    private int studentId;
    private String name;
    private int age;
    private String major;

    public Student(int studentId, String name, int age, String major) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                '}';
    }
}
