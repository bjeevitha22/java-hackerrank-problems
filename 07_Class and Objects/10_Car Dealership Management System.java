import java.util.*;

class Car {
    String brand;
    String model;
    int year;
    double price;
    double engineCapacity;

    // Parameterized constructor
    Car(String brand, String model, int year, double price, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.engineCapacity = engineCapacity;
    }

    // Display car details
    void displayCarDetails() {
        System.out.println("Car Details: ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Engine Capacity: " + engineCapacity + " L");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the brand of the car:");
        String brand = sc.nextLine();

        System.out.println("Enter the model of the car:");
        String model = sc.nextLine();

        System.out.println("Enter the year of manufacture:");
        int year = sc.nextInt();

        System.out.println("Enter the price of the car:");
        double price = sc.nextDouble();

        System.out.println("Enter the engine capacity of the car:");
        double engineCapacity = sc.nextDouble();

        // Validation
        if (year <= 1885 || price <= 0 || engineCapacity <= 0) {
            System.out.println("Invalid Input");
        } else {
            Car car = new Car(brand, model, year, price, engineCapacity);
            car.displayCarDetails();
        }

        sc.close();
    }
}
