import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int temp = N;
        int count = 0;

        // Find number of digits
        while (temp > 0) {
            count++;
            temp = temp / 10; 
        }

        if (K > count) {
            System.out.println(-1);
        } else {
            // Remove digits from the right
            int position = count - K; 

            while (position > 0) { 
                N = N / 10; 
                position--;
            }

            System.out.println(N % 10);
        }
    }
}
