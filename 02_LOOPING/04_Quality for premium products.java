import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Regular Product");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Premium Product");
            } else {
                System.out.println("Regular Product");
            }
        }

        sc.close();
    }
}
