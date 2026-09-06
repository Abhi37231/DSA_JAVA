public class leetcode3536 {
    public static void main(String[] args) {
        int n = 31;
        int[] arr = new int[3];

        for(int i=arr.length-1;i>=0;i--){

            arr[i] = n % 10;
            n = n/10;

        }
        int max = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                
                int pro = arr[i]*arr[j];

                max = Math.max(max,pro);
            }
        }
        System.out.println(max);

    }

}
