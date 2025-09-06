import java.util.*;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        // Math.min
        System.out.println("Minimum: " + Math.min(a, b));

        // Math.max
        System.out.println("Maximum: " + Math.max(a, b));

        // Math.sqrt
        System.out.println("Square root of " + a + ": " + Math.sqrt(a));
        System.out.println("Square root of " + b + ": " + Math.sqrt(b));

        // Math.pow
        System.out.println(a + " raised to power " + b + ": " + Math.pow(a, b));

        // Math.abs
        System.out.println("Absolute value of " + a + ": " + Math.abs(a));
        System.out.println("Absolute value of " + b + ": " + Math.abs(b));

        // Average (since Math.avg() does not exist)
        double average = (a + b) / 2.0;
        System.out.println("Average of " + a + " and " + b + ": " + average);

        sc.close();
    }
}
