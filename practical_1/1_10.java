public class OperatorsDemo {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10, b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Logical operators
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));
        System.out.println("!y = " + (!y));

        // Bitwise operators
        int p = 5, q = 3;
        System.out.println("p & q = " + (p & q));
        System.out.println("p | q = " + (p | q));
        System.out.println("p ^ q = " + (p ^ q));
        System.out.println("~p = " + (~p));
        System.out.println("q << 2 = " + (q << 2));
        System.out.println("q >> 1 = " + (q >> 1));

        // Relational operators
        int c = 10, d = 20;
        System.out.println("c == d = " + (c == d));
        System.out.println("c != d = " + (c != d));
        System.out.println("c > d = " + (c > d));
        System.out.println("c < d = " + (c < d));
        System.out.println("c >= d = " + (c >= d));
        System.out.println("c <= d = " + (c <= d));

        // Assignment operators
        int e = 5, f = 10;
        e += f;
        System.out.println("e += f: " + e);
        e -= f;
        System.out.println("e -= f: " + e);
        e *= f;
        System.out.println("e *= f: " + e);
        e /= f;
        System.out.println("e /= f: " + e);
        e %= f;
        System.out.println("e %= f: " + e);
    }
}


//OUTPUT

// a + b = 15
// a - b = 5
// a * b = 50
// a / b = 2
// a % b = 0
// x && y = false
// x || y = true
// !x = false
// !y = true
// p & q = 1
// p | q = 7
// p ^ q = 6
// ~p = -6
// q << 2 = 12
// q >> 1 = 1
