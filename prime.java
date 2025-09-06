import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int n = sc.nextInt();

    

        int div = 2;

        while(div<n){
            if (n%div == 0){
                System.out.println("Not prime");
            }
            else{
                div = div  + 1;

            }
        }
        {
            System.out.println("Prime Number");
           

        }
         
    }
    
}
