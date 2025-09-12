import java.util.*;
class p4 {
  
      
    public static void majorityElement(int[] nums) {
        int maj = Integer.MIN_VALUE;
        int n = nums.length;
        while(){
            if(nums[i]>maj)
            maj=nums[i];
            i++;
        }
        System.out.println(maj);
    }
    public static void main(String args[]){
        int nums[] ={3,2,3};
        majorityElement(nums);
        
    }
}