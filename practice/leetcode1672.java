public class leetcode1672 {
    public static void main(String[] args) {
        int accounts[][]= {{1,2,3},{3,2,1}};

        int n = accounts.length;

        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j =0;j<n;j++){
                sum += accounts[i][j];

            }
        }
    }
}
