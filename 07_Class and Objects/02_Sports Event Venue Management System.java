import java.util.*;

class Venue {
    String venueName;
    String city;

    // Constructor
    Venue(String venueName, String city) {
        this.venueName = venueName;
        this.city = city;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Venue Details");
        System.out.println("Venue Name : " + venueName);
        System.out.println("City Name : " + city);
        System.out.println(venueName);
    }
}

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the venue name");
        String venueName = sc.nextLine();

        System.out.println("Enter the city name");
        String city = sc.nextLine();

        // Create Venue object
        Venue v = new Venue(venueName, city);

        // Display venue details
        v.displayDetails();
    }
}
