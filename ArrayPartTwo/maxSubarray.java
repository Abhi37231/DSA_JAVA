import java.util.*;

public class maxSubarray {
    public static void MaxSubarraySum(int num[]){
        int maxValue = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start = i;
            for (int j=i;j<num.length;j++){
                int end = j;
                int sum = 0;

                for(int k=start;k<=end;k++){
                    System.out.print(num[k]+" ");
                    sum += num[k];

                }System.out.print("Sum is: "+sum);
                maxValue = Math.max(maxValue, sum);

                System.out.println(); 
            }System.out.println();
           
        }
         System.out.println("Max Value: "+maxValue);
        
    }


    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        MaxSubarraySum(num);

        
    }
    
}
