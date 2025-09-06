import java.util.Scanner;

public class evenoddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.print("Enter the number: ");
            num = sc.nextInt();

            if(num % 2 == 0){
                evenSum += num;

            }else{
                oddSum += num;

            }
            System.out.println("If want to continue?press 1for yes & 0 for no ");
            choice = sc.nextInt();


        }while(choice==1);
        System.out.println("Sum of even number: "+ evenSum);
        System.out.println("Sum of even number: " + oddSum);


    }
    
}
