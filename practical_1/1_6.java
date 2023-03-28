public class VariableScope {
    public static void main(String[] args) {
        int x = 10; // local variable

        if (x == 10) {
            int y = 20; // local variable
            System.out.println("x and y: " + x + " " + y);
        }

        // y is not accessible here because it is out of scope
        System.out.println("x is: " + x);
       // System.out.println("y is: " + y); // This line will cause a compiler error
    }
}

//ERROR MESSAGE

// error: cannot find symbol
//         System.out.println("y is: " + y);
//                                         ^
//   symbol:   variable y
//   location: class VariableScope
