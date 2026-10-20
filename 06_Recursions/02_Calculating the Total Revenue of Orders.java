import java.util.*;

public class Solution {

    static int totalRevenue(int n) {
        // Base case
        if (n == 1) {
            return 1;
        }

        // Recursive case
        return n + totalRevenue(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(totalRevenue(n));
    }
}
