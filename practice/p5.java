import java.util.*;
class p5 {
    
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            boolean isUnique = true;

            for(int j=0;j<nums.length;j++){
                if(i!=j &&nums[i]==nums[j]){
                   isUnique = false;
                   break;

                }
            }
            if(isUnique){
                return nums[i];
            }

        }
        return -1;
       
        
    }

    public static void main(String arg[]){
        int nums[] = {2,2,1};
        System.out.println(new p5().singleNumber(nums));
    }
}