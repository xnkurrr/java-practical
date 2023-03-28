//note: this program may be different from the one in the book.

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Mammal extends Animal {
    void breathe() {
        System.out.println("Mammal is breathing");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Bat extends Mammal {
    void fly() {
        System.out.println("Bat is flying");
    }
}

class Robot {
    void move() {
        System.out.println("Robot is moving");
    }
}

class RobotDog extends Dog {
    void walk() {
        System.out.println("RobotDog is walking");
    }
}

public class Main {
    public static void main(String[] args) {
        RobotDog myRobotDog = new RobotDog();
        myRobotDog.eat();
        myRobotDog.breathe();
        myRobotDog.bark();
        myRobotDog.walk();

        Bat myBat = new Bat();
        myBat.eat();
        myBat.breathe();
        myBat.fly();

        Robot myRobot = new Robot();
        myRobot.move();
    }
}

// output
// Animal is eating
// Mammal is breathing
// Dog is barking
// RobotDog is walking
// Animal is eating
// Mammal is breathing
// Bat is flying
// Robot is moving
