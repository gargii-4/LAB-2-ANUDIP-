import java.util.*;

class Car {
    String make;
    String model;
    short year;
    int price;

    public Car(String make, String model, short year, int price) {     // Constructor
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
// Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturing Year: " + year);
        System.out.println("Car Price: ₹" + price);
        System.out.println("-----------------------------");
    }
}

public class CarProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// accepting details
        System.out.print("Enter Car Make: ");
        String make = sc.nextLine();
        System.out.print("Enter Car Model: ");
        String model = sc.nextLine();
        System.out.print("Enter Manufacturing Year: ");
        short year = sc.nextShort();
        System.out.print("Enter Car Price: ");
        int price = sc.nextInt();
// car obj created
        Car car1 = new Car(make, model, year, price);
// Displaying car details
        System.out.println("\nCar Details:");
        car1.displayCarDetails();

        sc.close();
    }
}
