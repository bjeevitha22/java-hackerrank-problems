import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][n];

        // Read the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Find and print the maximum of each column
        for (int j = 0; j < n; j++) {
            int max = a[0][j];
            for (int i = 1; i < n; i++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            System.out.println(max);
        }
    }
}
