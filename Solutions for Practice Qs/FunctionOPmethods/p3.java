import java.util.*;


public class p3 {
    public static boolean isPalindrome(int n){

        int palindrome = n;
        int rev = 0;

        while(palindrome != 0){
            int remainder = palindrome % 10;
            rev = rev *10 + remainder;

            palindrome = palindrome /10;

        }
        if(n == rev){
            return true;

        }
        return false;



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter Number: ");
        int palindrome = sc.nextInt();
        if(isPalindrome(palindrome)){
            System.out.println("Given number "+ palindrome + "is palindrome" );

        }
        else{
            System.out.println("Given Number " + palindrome + "is not a palindrome");
        }




    }
}
