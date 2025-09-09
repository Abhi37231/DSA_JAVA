import java.util.*;

public class Arraycc {
    public static void main(String[] args) {
        int marks[] = new int[3];
        Scanner sc = new Scanner(System.in);
        
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("math: " + marks[0]);
        System.out.println("phy: " + marks[1]);
        System.out.println("chem: " + marks[2]);
        
        
    
        int percentage = (marks[0]+marks[1]+marks[2]/3);
        System.out.println("percentage: "+percentage+"%");
        System.out.println(marks.length);

    }    
}
