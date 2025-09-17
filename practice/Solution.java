class Solution {
    
    public static boolean isPalindrome(int x) {
       int revNum = 0;
       int num = x;
        
        while(num!=0){
            int rem = num%10;
            revNum = revNum *10+rem;
            num = num/10;
        }
        System.out.println(revNum);
        if( x == revNum){
            return true;
        }else{
        return false;
        }

        
    }
    public static void main(String args[]){
        int x = 121;
      System.out.println(isPalindrome(x));
    }
}