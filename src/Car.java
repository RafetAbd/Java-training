
public class Car {
    
    String make = "BMW";
    String model = "X4";
    int year = 2020;
    String color = "black";
    double price = 50000;


    // override the toString method
    public String toString() {
        return  make + "\n" + color + "\n" + model + "\n" + year;
    }

    void drive() {
        System.out.println("you are driving the car");
    }
    void brake() {
        System.out.println("you steps on the braks!");
    }
}
