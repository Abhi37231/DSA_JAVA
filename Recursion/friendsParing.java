public class friendsParing {
    public static int friendsParing(int n){
        if( n == 1 || n == 2){
            return n;
        }
        int fnm1 = friendsParing(n-1);
        int fnm2 = friendsParing(n-2);

        int totalPairs = (n-1)* fnm2;

        int totalWays = (n-1)+totalPairs;
        return totalWays;

    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendsParing(n));
    }
}
