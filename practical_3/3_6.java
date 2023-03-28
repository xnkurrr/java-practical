//this program shows the use of multiple inheritance in java(using interface)

interface add {
    int c = 10;

    public void show(int a, int b);
}

interface sub {
    int d = 20;

    public void disp(int a, int b);
}

class arith implements add, sub {
    public void show(int a, int b) {
        System.out.println(a + b + c);
    }

    public void disp(int a, int b) {
        System.out.println(a - b - c);
    }

    public static void main(String args[]) {
        arith a = new arith();
        a.show(5, 3);
        a.disp(5, 7);
    }
}

// output
// 18
// -13
