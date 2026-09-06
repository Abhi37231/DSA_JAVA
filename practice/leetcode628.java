import java.util.Arrays;
public class leetcode628{
    public static void main(String arg[]){
        int nums[] = {1,2,4,3};
        Arrays.sort(nums);
        int n =nums.length;
        int ans = 1;
        for(int i=n-2;i<n;i++){
            ans = nums[i]*ans;
        }
        System.out.println(ans);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}