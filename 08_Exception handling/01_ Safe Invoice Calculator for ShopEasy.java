import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total price of the items: ");
        double totalPrice = sc.nextDouble();

        int quantity;

        while (true) {
            System.out.println("Enter the number of items: ");
            quantity = sc.nextInt();

            try {
                if (quantity == 0) {
                    throw new ArithmeticException();
                }

                double pricePerItem = totalPrice / quantity;
                System.out.printf("Price per item: %.2f%n", pricePerItem);
                break;

            } catch (ArithmeticException e) {
                System.out.println(
                    "Error: Number of items cannot be zero. Please enter a valid quantity."
                );
            }
        }

        sc.close();
    }
}
