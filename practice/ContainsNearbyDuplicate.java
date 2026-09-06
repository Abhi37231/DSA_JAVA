import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContainsNearbyDuplicate {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (nums[i] == nums[j]) {

                    if (j - i <= k) {
                        return true;
                    }

                }

            }

        }

        return false;
    }

    public static void main(String[] args) {

        try {

            File file = new File("input.txt");
            Scanner sc = new Scanner(file);

            int n = sc.nextInt();

            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int k = sc.nextInt();

            boolean ans = containsNearbyDuplicate(nums, k);

            System.out.println("Answer: " + ans);

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("input.txt file not found!");
        }
    }
}