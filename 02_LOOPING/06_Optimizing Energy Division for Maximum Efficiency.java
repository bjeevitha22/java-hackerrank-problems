import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 2) {
            System.out.println(1);
        } else if (n == 3) {
            System.out.println(2);
        } else {
            int product = 1; //always initialize prod=1 and sum=0

            while (n > 4) {  //8>4    5>4   2>4 no stoped whileloop
                product *= 3;  //1*3=3     3*3=9-->prod
                n -= 3;    //5  again while loop      5-3=2
            }

            product *= n;   // 9*2=18-->O/P
            System.out.println(product);
        }

        sc.close();
    }
}
