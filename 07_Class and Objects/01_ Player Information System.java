import java.util.*;

class Player {
    private String name;
    private String country;
    private String skill;

    // Constructor
    Player(String name, String country, String skill) {
        this.name = name;
        this.country = country;
        this.skill = skill;
    }

    // Method to display player details
    void displayDetails() {
        System.out.println("Player Details: ");
        System.out.println("Player Name : " + name);
        System.out.println("Country Name : " + country);
        System.out.println("Skill : " + skill);
    }
}

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the player name");
        String name = sc.nextLine();

        System.out.println("Enter the country name");
        String country = sc.nextLine();

        System.out.println("Enter the skill");
        String skill = sc.nextLine();

        // Create Player object
        Player p = new Player(name, country, skill);

        // Display details
        p.displayDetails();
    }
}
