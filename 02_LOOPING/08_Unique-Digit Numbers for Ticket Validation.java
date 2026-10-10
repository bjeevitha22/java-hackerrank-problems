import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int count = 0;

        for (int i = n1; i <= n2; i++) {

            int num = i;
            int[] digit = new int[10];
            boolean unique = true;

            if (num == 0) {
                count++;
                continue;
            }

            while (num > 0) {

                int d = num % 10;

                if (digit[d] == 1) {
                    unique = false;
                    break;
                }

                digit[d] = 1;
                num = num / 10;
            }

            if (unique) {
                count++;
            }
        }

        System.out.println(count);
    }
}
