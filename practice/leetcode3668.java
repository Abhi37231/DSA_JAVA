public class leetcode3668 {
    public static void main(String[] args) {
        int[] order = {3,1,2,5,4};
        int[] friends = {1,3,4};

        int[] ans = new int[friends.length];
        int k = 0;

        for (int i = 0; i < order.length; i++) {

            for (int j = 0; j < friends.length; j++) {

                if (order[i] == friends[j]) {
                    ans[k] = order[i];
                    k++;
                }
            }
        }



        for(int i = 0 ; i<friends.length;i++){
            System.out.print(ans[i]+" ");
        }

        
    }
}
    

