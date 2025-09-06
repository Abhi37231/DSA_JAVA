import java.util.*;

public class p1 {
    public static double avrage(double a,double b, double c){
        return (a + b + c )/3;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        double a = sc.nextDouble();
        System.out.println("Enter B: ");
        double b = sc.nextDouble();
        System.out.println("Enter B: ");
        double c = sc.nextDouble();

        System.out.println("The avrage is: " + avrage(a, b, c));
    }
}
