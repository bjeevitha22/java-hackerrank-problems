import java.util.*;

class Innings {
    String number;
    String battingTeam;
    Long runs;

    // Method to display innings details
    void displayInningsDetails() {
        System.out.println("Innings Details :");
        System.out.println("Innings number : " + number);
        System.out.println("BattingTeam :" + battingTeam);
        System.out.println("Runs scored :" + runs);
    }
}

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the innings number");
        String number = sc.nextLine();

        System.out.println("Enter the BattingTeam");
        String battingTeam = sc.nextLine();

        System.out.println("Enter the runs scored");
        Long runs = sc.nextLong();

        // Create Innings object
        Innings innings = new Innings();

        // Assign values
        innings.number = number;
        innings.battingTeam = battingTeam;
        innings.runs = runs;

        // Display details
        innings.displayInningsDetails();
    }
}
