import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score1 = sc.nextInt();
        int score2 = sc.nextInt();
        int score3 = sc.nextInt();

        if ((score1 >= score2 && score1 <= score3) || (score1 >= score3 && score1 <= score2)) {
            System.out.println(score1);
        } else if ((score2 >= score1 && score2 <= score3) || (score2 >= score3 && score2 <= score1)) {
            System.out.println(score2);
        } else {
            System.out.println(score3);
        }

        sc.close();
    }
}
