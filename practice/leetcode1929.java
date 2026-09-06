public class leetcode1929 {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        int n = nums.length;
        int[] ans = new int[n*2];
        int i =0;
        int k = 0;
       while(i != ans.length){

        ans[i] = nums[k];
        i++;
        k++;
        if(k>n-1){
            k = 0;
        }
       }

        for(int j=0;j<2*n;j++){
            System.out.print(ans[j]+" ");
        }
    }
}
