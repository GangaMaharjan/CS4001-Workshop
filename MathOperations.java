import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

    
        System.out.println("\n=== Arithmetic Operators ===");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + (a / b));
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Division and Modulus cannot be performed (division by zero).");
        }

        
        System.out.println("\n=== Unary Operators ===");
        System.out.println("Post-increment (a++): " + (a++));
        System.out.println("After post-increment, a = " + a);

        System.out.println("Pre-increment (++b): " + (++b));
        System.out.println("After pre-increment, b = " + b);

        
        
        System.out.println("\n=== Assignment Operators ===");
        a += 5;
        System.out.println("a += 5: " + a);

        a -= 2;
        System.out.println("a -= 2: " + a);

        a *= 2;
        System.out.println("a *= 2: " + a);

        a /= 2;
        System.out.println("a /= 2: " + a);

        
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println("\n=== Logical Operators ===");
        boolean condition1 = (a > 0);
        boolean condition2 = (b > 0);

        System.out.println("condition1 && condition2: " + (condition1 && condition2));
        System.out.println("condition1 || condition2: " + (condition1 || condition2));
        System.out.println("!condition1: " + (!condition1));

        System.out.println("\n=== Ternary Operator ===");
        String result = (a > b) ? "a is greater than b" : "a is not greater than b";
        System.out.println(result);

        scanner.close();
    }
}