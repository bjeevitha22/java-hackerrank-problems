import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height1 = sc.nextInt();
        int height2 = sc.nextInt();
        int height3 = sc.nextInt();

        if (height1 >= height2 && height1 >= height3) {
            System.out.println(height1);
        } else if (height2 >= height1 && height2 >= height3) {
            System.out.println(height2);
        } else {
            System.out.println(height3);
        }

        sc.close();
    }
}
