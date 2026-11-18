import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products: ");
        int n = Integer.parseInt(sc.nextLine());

        String[] feedback = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter feedback for product " + (i + 1) + ": ");
            String input = sc.nextLine();

            if (input.equals("(blank)")) {
                feedback[i] = null;
            } else {
                feedback[i] = input;
            }
        }

        for (int i = 0; i < n; i++) {
            try {
                System.out.println("Feedback for product " + (i + 1) + ": "
                        + feedback[i].toString());
            } catch (NullPointerException e) {
                System.out.println("Feedback for product " + (i + 1) + ": (blank)");
            }
        }

        sc.close();
    }
}
