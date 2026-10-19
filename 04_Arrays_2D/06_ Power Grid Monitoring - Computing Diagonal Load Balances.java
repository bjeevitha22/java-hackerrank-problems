import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][n];

        int primary = 0;
        int secondary = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();

                if (i == j) {
                    primary += a[i][j];
                }

                if (i + j == n - 1) {
                    secondary += a[i][j];
                }
            }
        }

        System.out.println(primary + " " + secondary);
    }
}
