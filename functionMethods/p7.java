import java.util.*;

public class p7{
    public static void binTodec(int binNum){
        int myNum = binNum;

        int pow = 0;
        int decNum = 0;

        while(binNum >0){
            int lastDig = binNum%10;
            decNum = decNum + (lastDig*(int)Math.pow(2,pow));

            pow++;
            binNum = binNum/10;
            
        }
        System.out.println("Conversion of "+myNum+" Binary number is: "+ decNum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt();

        binTodec(binNum);
    }
}