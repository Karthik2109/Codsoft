import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Grade Calculator!");

        // Get weights for assignments and exams
        System.out.print("Enter the weight for assignments (in percentage): ");
        double assignmentWeight = scanner.nextDouble() / 100;

        System.out.print("Enter the weight for exams (in percentage): ");
        double examWeight = scanner.nextDouble() / 100;

        // Get scores for assignments
        System.out.print("Enter the number of assignments: ");
        int numAssignments = scanner.nextInt();
        double totalAssignmentScore = 0;
        for (int i = 1; i <= numAssignments; i++) {
            System.out.print("Enter score for Assignment " + i + ": ");
            totalAssignmentScore += scanner.nextDouble();
        }

        // Get scores for exams
        System.out.print("Enter the number of exams: ");
        int numExams = scanner.nextInt();
        double totalExamScore = 0;
        for (int i = 1; i <= numExams; i++) {
            System.out.print("Enter score for Exam " + i + ": ");
            totalExamScore += scanner.nextDouble();
        }

        // Calculate final grade
        double finalGrade = (assignmentWeight * totalAssignmentScore + examWeight * totalExamScore)
                            / (assignmentWeight + examWeight);

        System.out.println("Your final grade is: " + finalGrade);

        scanner.close();
    }
}

