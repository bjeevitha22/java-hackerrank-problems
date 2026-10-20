import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();   // Input string
        char x = sc.nextLine().charAt(0); // Character to remove

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != x) {
               System.out.print(ch);
            }
        }
    }
}
