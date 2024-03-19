import java.util.Scanner;

public class QuizApplication {
    private static final int NUM_QUESTIONS = 3;
    private static final int TIME_LIMIT_PER_QUESTION_SECONDS = 10;
    private static final String[] questions = {
        "What is the capital of France?",
        "Which planet is known as the Red Planet?",
        "Who wrote 'To Kill a Mockingbird'?"
    };
    private static final String[][] options = {
        {"A. London", "B. Paris", "C. Rome", "D. Madrid"},
        {"A. Jupiter", "B. Venus", "C. Mars", "D. Saturn"},
        {"A. Harper Lee", "B. Mark Twain", "C. J.K. Rowling", "D. Charles Dickens"}
    };
    private static final char[] correctAnswers = {'B', 'C', 'A'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz Application!");
        System.out.println("You have " + TIME_LIMIT_PER_QUESTION_SECONDS + " seconds to answer each question.");

        for (int i = 0; i < NUM_QUESTIONS; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer: ");
            long startTime = System.currentTimeMillis();
            char userAnswer = scanner.next().toUpperCase().charAt(0);
            long endTime = System.currentTimeMillis();
            long elapsedTimeSeconds = (endTime - startTime) / 1000;

            if (userAnswer == correctAnswers[i] && elapsedTimeSeconds <= TIME_LIMIT_PER_QUESTION_SECONDS) {
                score++;
                System.out.println("Correct! You answered within the time limit.");
            } else {
                System.out.println("Incorrect or time ran out!");
            }
        }

        System.out.println("\nQuiz completed!");
        System.out.println("Your final score is: " + score + "/" + NUM_QUESTIONS);

        scanner.close();
    }
}
