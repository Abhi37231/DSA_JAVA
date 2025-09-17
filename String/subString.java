import java.util.*;

public class subString {
    public static String getSubStr(String str,int si,int ei){
        String subStr = "";

        for(int i=si;i<ei;i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(getSubStr(str, 0, 5));

    }
    
}
