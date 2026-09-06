import java.util.*;
public class pattern{
    public static void main(String[] args) 
        throws InterruptedException{
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
        while(true){
        for (int i = 1;i <= n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j = 1;j<=2*(n-i);j++){
            System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            Thread.sleep(100);
        }
        for(int i=n;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j = 1;j<=2*(n-i);j++){
            System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
             Thread.sleep(100);


        }}
    }}
