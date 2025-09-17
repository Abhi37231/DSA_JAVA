import java.util.Arrays;

public class p1 {
    public static int[] plusOne(int digits[]) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // Just add 1 and return
                return digits;
            }
            digits[i] = 0;  // If it's 9, make it 0 and continue
        }
        
        // If all were 9 → need a bigger array
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        return newArray;
    }

    public static void main(String[] args) {
        int digits1[] = {1, 2, 3};
        int digits2[] = {9, 9, 9};
        int digits3[] = {9};

        System.out.println(Arrays.toString(plusOne(digits1))); // [1, 2, 4]
        System.out.println(Arrays.toString(plusOne(digits2))); // [1, 0, 0, 0]
        System.out.println(Arrays.toString(plusOne(digits3))); // [1, 0]
    }
}
