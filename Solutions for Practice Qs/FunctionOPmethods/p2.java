import java.util.*;

public class p2 {

    public static boolean isEven(int n){
        if(n%2==0){
            return true;

        }
        else{
            return false;
            
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        if(isEven(n)){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
