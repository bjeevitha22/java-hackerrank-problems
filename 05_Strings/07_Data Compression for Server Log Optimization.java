import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String result = "";

        result = result + s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                result = result + s.charAt(i);
            }
        }

        for (int i = result.length() - 1; i >= 0; i--) {
            System.out.print(result.charAt(i));
        }
    }
}
