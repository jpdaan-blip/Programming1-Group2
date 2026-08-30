//Create StudentGradeCalculator

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Read Student's name
        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();
        
        //Read three grade
        System.out.print("Enter grade 1: ");
        double grade1 = scanner.nextDouble();

        System.out.print("Enter grade 2: ");
        double grade2 = scanner.nextDouble();

        System.out.print("Enter grade 3: ");
        double grade3 = scanner.nextDouble();
        
        //Calculate arevage grade
        double average = (grade1 + grade2 + grade3) / 3;
        
        //Output result
        System.out.println("\nStudent Name: " + name);
        System.out.printf("Average Grade: %.2f%n", average);

        scanner.close();
    }
}