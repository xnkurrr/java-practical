// *** IMP : RUN BOTH PROGRAM SEPARATELY !!! ***

//throw keyword

import org.junit.internal.Throwables;

class Main {
    public static void main(String[] args) {
        Throwable t1 = new Throwable();
        try {
            System.out.println(15 / 0);
            throw t1;
        } catch (Throwable t2) {
            System.out.println(t2);
        }
    }
}

// output
// java.lang.Throwable
// java.lang.ArithmeticException: / by zero

// throws keyword
class Main {
    static void check_a() throws ArithmeticException {
        throw new ArithmeticException("ankur");
    }

    public static void main(String[] args) {
        try {
            check_a();
        } catch (ArithmeticException w) {
            System.out.println(w);
        }
    }
}

// output
// java.lang.ArithmeticException: ankur
