import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while (temp > 0) {            //temp=145
            int digit = temp % 10;  //remainder % digit= 5

            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;  //0+120=120
            temp /= 10;     //145/10=14 again while loop same   //procedure 24 sum nxt while 14/10=1 again while loop //sum=120+24+1=145 o/p
        }

        if (sum == n) {
            System.out.println("Rare Item");
        } else {
            System.out.println("Common Item");
        }

        sc.close();
    }
}
