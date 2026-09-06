public class leetcode1470 {
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3,3};
        int n = 6;
        int ans[] = new int[n];
        int k = n/2;
        int x = 0;
        int y = k;
        for(int i =0;i<n;i++){
        if(i%2 == 0){
            ans[i] = nums[x];
            x++;
        }
        if(i%2!= 0){
            ans[i] = nums[k];
            k++;
        }
    }   

        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }

        
    }
}
