import java.util.*;

public class Solution {

    static int gcd(int a, int b) {
        // Base case
        if (b == 0) {
            return a;
        }

        // Recursive case
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b));
    }
}
