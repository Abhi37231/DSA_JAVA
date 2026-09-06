public class leetcode238{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n = nums.length;
        int ans[] = new int[n];
        
        for(int i=0;i<n;i++){
            
            int product = 1;
            for(int j=0;j<n;j++){
                
            if(i != j){
                product = product*nums[j] ;
                

            }
          

            ans[i] = product;
        }
    }
        for(int i = 0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}