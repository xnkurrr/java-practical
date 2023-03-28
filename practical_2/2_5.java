//this program shows how to create a class with constructor and parameterized constructor.

public class Person {
    String name;
    int age;

    // Default constructor
    public Person() {
        name = "John Doe";
        age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object using default constructor
        Person person1 = new Person();
        person1.display();

        // Creating an object using parameterized constructor
        Person person2 = new Person("Jane Doe", 25);
        person2.display();
    }
}


//output
// Name: John Doe
// Age: 0
// Name: Jane Doe
// Age: 25
