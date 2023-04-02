import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total marks: ");
        double totalMarks = sc.nextDouble();
        System.out.print("Enter marks obtained: ");
        double obtainedMarks = sc.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;
        System.out.println("Percentage: " + percentage + "%");

        double gpa = 0.0;
        if (percentage >= 90) {
            System.out.println("Grade A");
            gpa = 4.0;
        } else if (percentage >= 80) {
            System.out.println("Grade B");
            gpa = 3.0;
        } else if (percentage >= 70) {
            System.out.println("Grade C");
            gpa = 2.0;
        } else if (percentage >= 60) {
            System.out.println("Grade D");
            gpa = 1.0;
        } else {
            System.out.println("Grade F");
            gpa = 0.0;
        }

        System.out.println("GPA = " + gpa);
    }
}
