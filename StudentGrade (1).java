import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        
        int grade = 101;
        if (grade >=101) {
            System.out.println("INVALID GRADE");
        }else if (grade >=95) {
            System.out.println("EXCELLENT");
        }else if (grade >=88) {
            System.out.println("VERRY GOOD");
        }else if (grade >=82) {
            System.out.println("GOOD");
        }else if (grade >=76) {
            System.out.println("PASSED");
        }else if (grade >=65) {
            System.out.println("FAILED");
        }else {
            System.out.println("INVALID GRADE");
        }
        
    }
}