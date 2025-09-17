import java.util.*;

public class inAndOut {
    public static void printChr(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        
        // String str = "Abhinandan Yalamante";
        // System.out.println(str);
        // System.out.println(str.length());
        // System.out.println(str.charAt(0));
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(str);
        System.out.println();
        System.out.println(str.charAt(0));

        printChr(str);

        
    }
}
