public class Person {
    String name;
    int age;
    String gender;

    void introduce() {
        System.out.println("Hi, my name is " + name + ", I am " + age + " years old and I am " + gender + ".");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John";
        person1.age = 25;
        person1.gender = "male";
        person1.introduce();

        Person person2 = new Person();
        person2.name = "Jane";
        person2.age = 30;
        person2.gender = "female";
        person2.introduce();
    }
}

//ouput

// Hi, my name is John, I am 25 years old and I am male.
// Hi, my name is Jane, I am 30 years old and I am female.
