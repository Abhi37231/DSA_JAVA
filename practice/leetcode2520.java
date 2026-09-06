public class leetcode2520 {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;
        int k = n;

        while(k>0){
            int j = k%10;

            if(n%j ==0){
                count++;
            }
            k = k/10;
        }
        System.out.println(count);
    }
}
