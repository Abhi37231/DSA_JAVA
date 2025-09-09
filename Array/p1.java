public class p1 {
    public static void update1(int mark[]){
        for(int i=0;i<mark.length;i++){
           mark[i]=mark[i]+1;
              }
    }
    public static void main(String[] args) {
        int mark[] = {1,2,3};
        update1(mark);
        for(int i=0;i<mark.length;i++){
            System.out.print(mark[i] + " ");

        }
        System.out.println();
        
    }
    
}
