import java.util.Scanner;

public class StudentScoreValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        try {
            System.out.print("Enter student score: ");
            input = scanner.nextLine().trim();
            int score = Integer.parseInt(input);

            if (score < 0 || score > 100) {
                System.out.println("Score out of range");
            } else {
                System.out.println("Valid score");
            }
        } catch (NumberFormatException e) {
            if (input.matches("[+-]?\\d+\\.\\d+")) {
                System.out.println("Invalid whole-number input");
            } else {
                System.out.println("Invalid numeric input");
            }
        } finally {
            System.out.println("Score validation completed.");
            scanner.close();
        }
    }
}
