public class p6 {
    public static boolean palendrome(int x){
        int rev = 0;
        while( x != 0){

            int ls = x%10;
            rev = rev * 10 + ls;
           x /= 10;
           

        }
        
        if(rev != x){
            return true;
        }
        else{
            return false;

        }
    
    }
    public static void main(String[] args) {
        int x = 121;
        System.out.println(palendrome(x));
    }
    
}
