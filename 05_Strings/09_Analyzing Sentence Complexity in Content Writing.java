import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if (str == null || str.length() == 0) {
            System.out.println(0);
            return;
        }

        String[] words = str.split(" ");

        int hard = 0;
        int easy = 0;

        for (String word : words) {
            int vowels = 0;
            int consonants = 0;
            int consecutive = 0;
            boolean isHard = false;

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {

                    vowels++;
                    consecutive = 0;

                } else {
                    consonants++;
                    consecutive++;

                    if (consecutive >= 3) {
                        isHard = true;
                    }
                }
            }

            if (consonants > vowels) {
                isHard = true;
            }

            if (isHard) {
                hard++;
            } else {
                easy++;
            }
        }

        int result = (5 * hard) - (2 * easy);

        System.out.println(result);
    }
}
