import java.util.*;


public class weekname {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of week(1 - 7):");
        int week = sc.nextInt();

        switch (week){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Teusday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thersday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("Invalid choice");
            break;
            
        }
    }
}
