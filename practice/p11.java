public class p11 {
    public static void main(String[] args) {
        int[] arr = {9,6,8,4}; // missing 3
        int n = 5;

        int total = n * (n + 1) / 2;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int missing = total - sum;
        System.out.println("Missing number is: " + missing);

    }
}
