public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", 20);
        student1.printInfo();

        Student student2 = new Student("Jane", 22);
        student2.printInfo();
    }
}


//ouput
// Name: John
// Age: 20
// Name: Jane
// Age: 22
