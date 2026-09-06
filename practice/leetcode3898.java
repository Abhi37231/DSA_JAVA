import java.util.*;
public class leetcode3898 {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,0},{1,0,1},{0,0,0}};
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0;i<matrix.length;i++){
            int sum = 0;
            for(int j=0;j<matrix.length;j++){
                sum += matrix[i][j];
                
            }
            ans.add(sum);
        }
        for(int i =0;i<matrix.length;i++ ){
            System.out.print(ans.get(i)+" ");
        }

    }
}
