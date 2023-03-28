//this program shows the use of multiple catch blocks

public class Main {
    public static void main(String[] args) {
        try {
            int b = 19 / 0;
            int a[] = new int[5];
            a[8] = 10;
        } catch (Exception e1) {
            System.out.println(e1);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

// output
// java.lang.ArithmeticException: / by zero
