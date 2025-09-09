import java.util.*;

public class binarySearch {
    public static int binary_Search(int num[],int key){
        int start = 0;
        int end = num.length-1;

        while (start<=end) {
            int mid = (start+end)/2;
            if(num[mid] == key){
                return mid;

            }
            if(num[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;

            }
            
        }
        return -1;

    }
    public static void main(String[] args) {
        int num[] = {1,3,4,5,7,9,10};
        int key = 7;
        System.out.println("Key found at: "+binary_Search(num, key));

    }
}
