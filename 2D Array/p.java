public class p {
    public static void main(String[] args) {
        int j[][] = {{1,2},{5,4},{6,7}};

        int lv = Integer.MIN_VALUE;
        int sv = Integer.MAX_VALUE;


        for(int i=0;i<j.length;i++){
            for(int k=0;k<j.length;k++){
                if(j[i][k]>lv){
                    lv = j[i][k];
                }
                if(j[i][k]<sv){
                    sv = j[i][k];
                }

            }
        }
        int sum = 0;
        for(int i=sv;i<=lv;i++){
            sum = sum + i;
        }
        System.out.println(sum);

        // give 2d arr sum
        int sum2=0;

        for(int i=0;i<j.length;i++){
            for(int k=0;k<j.length;k++){
                sum2 = sum2+j[i][k];
            }
        }
        System.out.println(sum2);
        int Mv = sum-sum2;
        System.out.println("Mising value is:"+ Mv);
    }
}
