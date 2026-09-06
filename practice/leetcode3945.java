import java.util.ArrayList;

public class leetcode3945 {
    public static void main(String[] args) {
        

    int no = 1233;
    int h = no;

        int arr[] = {0,0,0,0,0,0,0,0,0,0};

        

       
        while(h !=0){
            int k = h%10;
            h = h/10;
        
            arr[k] = arr[k]+1;
            
        }
        int sum = 0;
        for(int j = 0 ; j<10;j++){
            sum += arr[j]*j;

        }
        System.out.print(sum);


         
    }
}
