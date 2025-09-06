import java.util.*;

public class p6 {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            boolean isPrime = true;

            if (n % i == 0) {
                isPrime = false;

                

            }
            return isPrime;
        }
        

    }

    public static void isPrimeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");

            }
            
        }System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrimeRange(n);
    }

}
