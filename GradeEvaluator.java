import java.util.Scanner;

public class GradeEvaluator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your numeric grade: ");
        int grade = scanner.nextInt();

        String result = (grade >= 40) ? "Pass" : "Fail";

        System.out.println("\n\t===== GRADE REPORT =====");
        System.out.println("\tGrade Entered:\t" + grade);
        System.out.println("\tResult:\t\t" + result);
        System.out.println("\t========================");

        scanner.close();
    }
}