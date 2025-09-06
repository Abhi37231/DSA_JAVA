import java.util.*;

public class hollowRect{
    public static void hollow_Rect(int totalRows, int totalCols){

        for(int i = 1;i<=totalRows;i++){
            for(int j = 1;j<=totalCols;j++){
                if(i== 1 ||i == totalRows || j== 1||j==totalCols){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");

                }
            }
            System.out.println();
        }



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total Numbers of Rows: ");
        int totalRows = sc.nextInt();
        System.out.println("Enter Total numbers of columns: ");
        int totalCols = sc.nextInt();

        hollow_Rect(totalRows, totalCols);
    }

}