//this program shows how to use nested try-catch block

class Main {
    public static void main(String[] args) {
        try {
            try {
                int a = 9 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int b[] = new int[5];
                b[8] = 10;
            } catch (ArrayIndexOutOfBoundsException e1) {
                System.out.println(e1);
            }
        } catch (Exception e3) {
            System.out.println(e3);
        }
    }
}

// output
// java.lang.ArithmeticException: / by zero
// java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 5
