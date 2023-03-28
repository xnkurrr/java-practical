public class FinalDemo {
    final int x = 10;
    static final double PI = 3.14;

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();

        // Cannot change the value of a final variable
        // obj.x = 20; // Compile error: cannot assign a value to final variable 'x'

        // The value of a final static variable cannot be changed
        // PI = 3.14159; // Compile error: cannot assign a value to final variable 'PI'

        System.out.println("x: " + obj.x);
        System.out.println("PI: " + PI);
    }
}

//output
// x: 10
// PI: 3.14

