public class DayTwo {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        
        int n = arr.length;
        int ans[] = new int[n];

        int k =2;
    for(int i = 0; i < n; i++) {

    if(i < k || i >= n-k) {
        ans[i] = -1;
    }
    else {
        int sum = 0;

        for(int j = i-k; j <= i+k; j++) {
            sum += arr[j];
        }

        ans[i] = sum / (2*k + 1);
    }
}
    
    for(int i = 0;i<n;i++){
        System.out.print(ans[i] + " ");
    }System.out.println();
    }
    
}
