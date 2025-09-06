
import java.util.*;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number you want to see multiplication table:");
        int n = sc.nextInt();

        for(int i = 1;i<=10;i++){
           int sum = n*i;


            System.out.println(n +" * "+i+" = "+ sum );
            
        }



}}