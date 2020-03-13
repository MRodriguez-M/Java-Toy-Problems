/*
(1) Compute a student's total course percentage based on scores on three items of diffrent weights:

20% Homework (out of 80 points)
30% Midterm exam (out of 40 points)
50% Final exam (out of 70 points)

(2) Add a quiz score of 20 points.
New weights:

10% Homework
15% Quizzes
30% Midterm exam
45% Final exam
*/

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double homework = 0;
        double midterm = 0;
        double finalExam = 0;
        double homeworkWeighted = 0;
        double midtermWeighted = 0;
        double finalWeighted = 0;
        double quizzes = 0.0;
        double quizWeighted = 0.0;
        double totalGrade = 0.0;

        // Prompt user for scores in homework, quizzes, the midterm, and the final
        System.out.print("Enter homework score: ");
        homework = scnr.nextDouble();
        System.out.print("Enter quiz score: ");
        quizzes = scnr.nextDouble();
        System.out.print("Enter midterm exam score: ");
        midterm = scnr.nextDouble();
        System.out.print("Enter final exam score: ");
        finalExam = scnr.nextDouble();

        // Calculate the weighted score for each section
        homeworkWeighted = (homework / 80 * 0.1) * 100;
        midtermWeighted = (midterm / 40 * 0.3) * 100;
        finalWeighted = (finalExam / 70 * 0.45) * 100;
        quizWeighted = (quizzes / 20 * 0.15) * 100;

        // Output the weighted score for each section
        System.out.println("\nGrade Total Breakdown:");
        System.out.printf("Homework: %.2f%%", homeworkWeighted);
        System.out.printf("\nQuizzes: %.2f%%", quizWeighted);
        System.out.printf("\nMidterm exam: %.2f%%", midtermWeighted);
        System.out.printf("\nFinal exam: %.2f%%", finalWeighted);

        // Calculate and output final grade based on weighted percentages
        totalGrade = homeworkWeighted + quizWeighted + midtermWeighted + finalWeighted;
        System.out.printf("\n\nFinal grade: %.2f%%", totalGrade);
    }
}