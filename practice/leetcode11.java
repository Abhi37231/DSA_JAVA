public class leetcode11 {
    public static void main(String[] args) {
        int height[] = {1,2,3,4};
        int n = height.length;


        int left = 0;
        int right = n-1;
        int maxWater = 0;
        int water = 0;

        while(left < right){

            int width = right - left;

            int h = Math.min(height[left],height[right]);
            
            water = width * h;

            maxWater = Math.max(maxWater, water);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }


        }
        System.out.println(maxWater);















        // int maxWater = 0;
        

        // for(int i = 0;i<n;i++){
        //     for(int j=0;j<n;j++){
                
        //         int min = Math.min(height[i],height[j]);

        //         int currWater = min * (j-i);

        //         maxWater = Math.max(maxWater,currWater);

        //     }
        // }

        // System.out.println(maxWater);
       
        


    }
}
