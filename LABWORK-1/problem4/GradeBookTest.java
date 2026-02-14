package problem4;

public class GradeBookTest {

    public static void main(String[] args) {

        Course course = new Course("OOP");
        GradeBook gb = new GradeBook(course);

        gb.addStudent(new Student("A", 1, 87));
        gb.addStudent(new Student("B", 2, 68));
        gb.addStudent(new Student("C", 3, 94));
        gb.addStudent(new Student("D", 4, 100));

        System.out.println("Class average: " + gb.determineClassAverage());
        gb.outputBarChart();
    }
}