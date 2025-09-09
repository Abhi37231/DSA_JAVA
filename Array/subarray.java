import java.util.*;

public class subarray {
    public static void subarray(int num[]){

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            int start = i;
            for(int j =i;j<num.length; j++){
                int end= j;
                int sum =0;
                for (int k =start;k<=end;k++){
                    sum+=num[k];
                    System.out.print(num[k]+ " ");
                
                }
                maxValue = Math.max(maxValue, sum);
                minValue = Math.min(minValue, sum);
                System.out.print(" Sum is "+sum);
                System.out.println();
            }System.out.println();
        }
        System.out.println("Max Sum is: "+maxValue);
        System.out.println("Min Sum is: "+minValue);

    }
    
    public static void main(String[] args) {
        int num []={2,4,6,8,10};
        subarray(num);

    }
}
