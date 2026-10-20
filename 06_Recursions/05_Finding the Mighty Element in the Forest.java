import java.util.*;

public class Solution {

    static int findMax(int[] arr, int n) {
        // Base case
        if (n == 1) {
            return arr[0];
        }

        // Find maximum of remaining elements
        int max = findMax(arr, n - 1);

        // Compare last element with maximum
        if (arr[n - 1] > max) {
            return arr[n - 1];
        } else {
            return max;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMax(arr, n));
    }
}
