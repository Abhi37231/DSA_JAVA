import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
         int a = sc.nextInt();
        System.out.println("Enter B : ");
       
        int b = sc.nextInt();
        System.out.println("Enter Oprator: ");
        char oprator =sc. next().charAt(0);

        switch (oprator ) {
            case '+': System.out.println("Total : "+ a+ b );
            break;
            case '-': System.out.println("Total : "+ (a-b) );
            break;
            case '*': System.out.println("Total : "+ a*b );
            break;
            case '/': System.out.println("Total : "+ a /  b );
            break;
            case '%': System.out.println("Total :" + a % b );
            break;

            default:System.out.println("My calculator is not that much advanced");
                break;
        }

    }
}
