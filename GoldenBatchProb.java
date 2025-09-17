import java.util.*;

public class GoldenBatchProb {
    public static void digonal(int matrix[][]){
        for(int i =0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
       int sum = 0;
       int secSum = 0;
       int endCol = matrix.length-1;
        for(int i=0;i<matrix.length;i++){
             
            for (int j=0;j<matrix.length;j++){
                
                if(i == j){
                    sum += matrix[i][j];
                    

                }
                if( i + j== endCol){

                    if (i != j){
                        secSum += matrix[i][j];
                    }
                    
                     

                }
            }
        }
        System.out.println(sum);
        System.out.println(secSum);
        System.out.println(sum+secSum);

    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        digonal(matrix);
    }
}
