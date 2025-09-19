import java.util.*;
public class oddOrEven{
    public static void oddOrEvn(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        int n = 4;
        oddOrEvn(n);
        oddOrEvn(5);
    }
}