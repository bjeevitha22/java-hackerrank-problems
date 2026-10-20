import java.util.*;

public class Solution {

    static int stringLength(String str, int index) {
        // Base case
        if (index == str.length()) {
            return 0;
        }

        // Recursive case
        return 1 + stringLength(str, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(stringLength(str, 0));
    }
}
