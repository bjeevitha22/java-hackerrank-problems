import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] words = s.split(" ");

        int max = 0;

        for (int i = 0; i < words.length; i++) {
            int count = 0;

            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);

                if (Character.isLetter(ch)) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
            }
        }

        System.out.println(max);
    }
}
