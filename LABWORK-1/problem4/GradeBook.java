package problem4;

import java.util.ArrayList;

public class GradeBook {

    private Course course;
    private ArrayList<Student> students;

    public GradeBook(Course course) {
        this.course = course;
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public double determineClassAverage() {
        int sum = 0;
        for (Student s : students)
            sum += s.getGrade();
        return (double) sum / students.size();
    }

    public void outputBarChart() {

        int[] freq = new int[11];

        for (Student s : students)
            freq[s.getGrade() / 10]++;

        for (int i = 0; i < freq.length; i++) {

            if (i == 10)
                System.out.print("100: ");
            else
                System.out.print(i * 10 + "-" + (i * 10 + 9) + ": ");

            for (int j = 0; j < freq[i]; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}