import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        Arrays.sort(marks);

        int sum = 0;
        for (int i = n - 1; i >= n - k; i--) {
            sum += marks[i];
        }

        System.out.println(sum);

        sc.close();
    }
}
