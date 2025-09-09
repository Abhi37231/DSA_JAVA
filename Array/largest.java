import java.util.*;

public class largest {
    public static int getaLargest(int num[]){
         int largest = Integer.MIN_VALUE;
         int smallest = Integer.MAX_VALUE;

        for(int i=0;i<num.length;i++){
           

            if (num[i]>largest){
                largest = num[i];

            }
            if(num[i]<smallest){
                smallest = num[i];

            }
        }
        System.out.println("Smallest of num is: "+smallest);
        return largest;
     
    }
    public static void main(String[] args) {
        int num []={1,2,4,3,6};

        System.out.println("largest num from array is: "+getaLargest(num));

    }
    
}
