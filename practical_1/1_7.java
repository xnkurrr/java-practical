// NOTE : PROGRAM MAY BE DIFFERENTLY FORMATTED IN THE MANUAL. 

public class TypeConversion {
    public static void main(String[] args) {
        // Implicit Type Conversion
        int num1 = 100;
        double num2 = num1; // Implicit conversion from int to double
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Explicit Type Conversion
        double num3 = 1234.56;
        int num4 = (int) num3; // Explicit conversion from double to int
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
    }
}
