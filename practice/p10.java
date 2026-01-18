
import java.util.*;
public class p10{
    public static int missing(int nums[]){
        int n = nums.length;

        int v[] = new int[n+1];

        Arrays.fill(v,-1);

        for(int i=0;i<nums.length;i++){
            v[nums[i]]=nums[i];
        }
        for(int i=0;i<v.length;i++){
            if(v[i] == -1) return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        int nums[] = {1,9,4,6,3,7};
        System.out.println(missing(nums));


    }
}