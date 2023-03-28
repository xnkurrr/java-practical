// Title: Copy Constructor

public class Student {
    String name;
    int age;

    // Copy constructor
    public Student(Student original) {
        name = original.name;
        age = original.age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object using default constructor
        Student student1 = new Student();
        student1.name = "John Doe";
        student1.age = 20;

        // Creating an object using copy constructor
        Student student2 = new Student(student1);

        // Displaying the attributes of both objects
        System.out.println("Student 1:");
        student1.display();
        System.out.println("\nStudent 2:");
        student2.display();
    }
}

//**explaination**

//   1.  We define a class named Student.
//   2.  Within the Student class, we define two instance variables - name and age.
//   3.  We define a copy constructor for the Student class which takes an object of the Student class as its argument.
//   4.  Within the copy constructor, we set the name and age instance variables of the new object to the same values as the object that was passed as an argument.
//   5.  We define a method named display() which simply prints the name and age instance variables of the object.
//   6.  In the main() method, we first create an object named student1 of the Student class using the default constructor.
//   7.  We then set the name and age instance variables of student1 to "John Doe" and 20, respectively.
//   8.  Next, we create an object named student2 of the Student class using the copy constructor and passing student1 as an argument.
//   9.  Finally, we call the display() method for both student1 and student2 objects to display their attributes.


// I hope this explanation helps!

//output

// Student 1:
// Name: John Doe
// Age: 20

// Student 2:
// Name: John Doe
// Age: 20






