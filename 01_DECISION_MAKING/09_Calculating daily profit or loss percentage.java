import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int investment = sc.nextInt();
        int earnings = sc.nextInt();

        if (investment < 0 || earnings < 0) {
            System.out.println("Invalid Input");
        } 
        else if (earnings > investment) {
            int profit = earnings - investment;
            int percentage = (profit * 100) / investment;
            System.out.println("Profit - " + percentage + "%");
        }
        else if (earnings < investment) {
            int loss = investment - earnings;
            int percentage = (loss * 100) / investment;
            System.out.println("Loss - " + percentage + "%");
        } 
        else {
            System.out.println("No Profit, No Loss");
        }

        sc.close();
    }
}
