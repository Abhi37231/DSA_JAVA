import java.util.*;

public class TrapedWater {
    public static int trapedWater(int hight[]){
        int n = hight.length;

        

        int leftMax[]=new int[n];
        leftMax[0]=hight[0];
        for(int i=1; i<n;i++){
            leftMax[i] = Math.max(hight[i],leftMax[i-1]);

        }
        int rightMax[] = new int[n];
        rightMax[n-1]= hight[n-1];
        for(int i=n-2; i>=0;i--){
            rightMax[i] = Math.max(hight[i],rightMax[i+1]);

        }
        int trapedwater = 0;
        for(int i=0;i<n;i++){
            int waterHight = Math.min(leftMax[i],rightMax[i]);
            trapedwater += waterHight - hight[i];
        }
        return trapedwater;

        
    }
    public static void main(String[] args) {
        int hight[] = {4,2,0,6,3,2,5};
        System.out.println("Total traped water: " + trapedWater(hight));

    }
    
}
