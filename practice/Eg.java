//array given. k given. find subarray which sum is k.
public class Eg {
    // 1 1 2 3 4 6 8  k=7
public static void main(String[] args) {
    int target=7;
    int[] arr = {1,2,3,4,6,7,4,8};
    int n= arr.length;
int low=0;
int sum=0;
int count =0;

for(int high=0; high<n; high++){
    
        sum += arr[high];
    while( sum > target){
        sum = sum-arr[low];
        low ++;

    }
    if(sum == target){
        count++;
    }
    
}


System.out.println(count);
}

}
