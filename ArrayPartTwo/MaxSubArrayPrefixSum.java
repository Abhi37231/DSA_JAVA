import java.util.*;

public class MaxSubArrayPrefixSum {
    public static void prefixMaxSubarray(int num[]){
        int crrSum = 0;
        int maxSum = Integer.MIN_VALUE;

        
        int prefix[] = new int[num.length];
        prefix[0]=num[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i]= prefix[i-1] + num[i];
        }
        for(int i=0;i<num.length;i++){
            int start = i;
            

            for(int j=i;j<num.length;j++){
                int end = j;
                crrSum = start ==0 ? prefix[end]: prefix[end]-prefix[start-1];


                if (maxSum<crrSum){
                    maxSum = crrSum;
                }


            }
        }
        System.out.println("Maximum Value is: "+maxSum);
    }
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        prefixMaxSubarray(num);

    }
    
}
