public class leetcode1295 {
    public static void main(String[] args) {

        int nums[] = {555,901,482,1771};

        int n = nums.length;
        int ch = 0;
        int count = 0;

        for(int i =0;i<n;i++){
            
            while(nums[i]>0){
                ch++;
                nums[i]=nums[i]/10;
            }
            if(ch%2 ==0){
                count++;
            }
            ch=0;
            
            
        }
        System.out.println(count);
    }
}
