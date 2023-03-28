//NOTE: program may be different from the one in the book.

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting");
    }
}

class Bike extends Vehicle {
    void accelerate() {
        System.out.println("Bike is accelerating");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.move();
        myCar.start();

        Bike myBike = new Bike();
        myBike.move();
        myBike.accelerate();
    }
}

// output
// Vehicle is moving
// Car is starting
// Vehicle is moving
// Bike is accelerating
