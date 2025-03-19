class Car {
    String make;
    String model;
    int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car info
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // Creating an object of Car
        Car myCar = new Car("Toyota", "Corolla", 2020);
        myCar.displayInfo();
    }
}
