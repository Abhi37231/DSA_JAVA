public class leetcod3300 {
    public static void main(String[] args) {
        int nums[] = {999,19};

        int n = nums.length;
        int min = Integer.MAX_VALUE;
        
        for(int i =0;i<n ; i++){
            int num = nums[i];
            int sum = 0;
            while (num > 0) {
            int  k = num % 10;
            sum = sum + k;
            num /= 10;

        }
        min = Math.min(min,sum);
        }
        System.out.println(min);
    }
}
