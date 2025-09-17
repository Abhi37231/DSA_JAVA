import java.util.*;

public class input_output {
    public static void searching(int matrix[][] , int key){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;


        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>largest){
                    largest = matrix[i][j];
                }
                if(matrix[i][j]<smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("largest element = " + largest);
        System.out.println("Smallest element ="+ smallest);


    }

    public static void main(String[] args) {
        int matrix[][] = new int [3][3];

        int n = 3,m=3;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix [i][j]= sc.nextInt();

            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }System.out.println();
        }

        searching(matrix, 5);

    }
}
