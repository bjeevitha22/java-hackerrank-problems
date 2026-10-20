import java.util.*;

class Player {
    String name;
    String country;
    String skill;

    void displayDetails() {
        System.out.println("Player Details ");
        System.out.println("Player Name : " + name);
        System.out.println("Country Name : " + country);
        System.out.println("Skill : " + skill);
    }
}

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the player details");

        String input = sc.nextLine();

        // Split the input using comma
        String[] details = input.split(",");

        // Create Player object
        Player p = new Player();

        p.name = details[0];
        p.country = details[1];
        p.skill = details[2];

        // Display details
        p.displayDetails();
    }
}
