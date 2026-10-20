import java.util.*;

public class Solution {

    static int countSetBits(int number) {
        // Base case
        if (number == 0) {
            return 0;
        }

        // Check the last bit and recursively process remaining bits
        return (number % 2) + countSetBits(number / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(countSetBits(number));
    }
}
