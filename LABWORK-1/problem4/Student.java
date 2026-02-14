package problem4;

public class Student {

    private String name;
    private int id;
    private int grade;

    public Student(String name, int id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public String toString() {
        return name + " (id: " + id + ")";
    }
}