import java.util.*;

public class p1 {
    public static void pattern_square(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
    public static void hollow_dimond_pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        // pattern_square(n);
        hollow_dimond_pattern(n);
    }
}
