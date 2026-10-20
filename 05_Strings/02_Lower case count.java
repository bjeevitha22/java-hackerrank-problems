import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)) {
                System.out.print(ch);
                count++;
            }
        }

        System.out.print(" "+count);
    }
}
