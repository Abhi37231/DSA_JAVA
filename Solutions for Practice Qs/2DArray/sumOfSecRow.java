import java.util.*;


public class sumOfSecRow {
    public static void sum(int nums[][],int key){
        key = key-1;
        int sum = 0;
     
            for(int j=0;j<nums[0].length;j++){
                sum += nums[1][j];
            
        }System.out.println(sum);
    }
    public static void main(String[] args) {
        int nums[][] = { {1,4,9},{11,4,3},{2,2,3} }; 
        int key = 2;
        sum(nums, key);
    }
    
}
