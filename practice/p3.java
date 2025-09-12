import java.util.*;

public class p3{
    public static boolean checkDublicate(int num[]){
        
        for(int i=0;i<num.length;i++){
           for(int j=i+1;j<num.length;j++){
            if( num[i]==num[j]){
                return true;
                

            }
            
            
           }

        }
        return true;
    }
    public static void main(String args[]){
        int num[]={1,3,4,3,6};
        System.out.println(checkDublicate(num));
    }
}