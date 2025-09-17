import java.util.*;

public class anagrams {
    public static boolean anagrams(String str1,String str2){
        int count =0;

        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    count++;


                }
            }
        }
        if(count == str1.length()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "abhinandan";
        String str2 = "bhai";
        System.out.println(anagrams(str1, str2));


    }
    
}
