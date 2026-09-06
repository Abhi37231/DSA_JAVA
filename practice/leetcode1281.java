public class leetcode1281 {
    public static void main(String[] args) {
        int n = 234;
        int pro = 1;
        int sum = 0;
        int ans = 0;

        while(n>0){
            int k = n%10;
            pro *= k;
            sum += k;
            n = n/10;
            
        }
        ans = pro-sum;

        System.out.println(ans);
    }
}
