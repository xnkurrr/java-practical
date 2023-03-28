//this program is to show the use of dynamic method dispatch

class A {
    void m1() {
        System.out.println("class A");
    }
}

class B extends A {
    void m1() {
        System.out.println("class B");
    }
}

class C extends B {
    void m1() {
        System.out.println("class C");
    }
}

class Main {
    public static void main(String[] ankoor) {
        A objA = new A();
        B objB = new B();
        C objC = new C();
        // creating refernce
        A ref;
        ref = objA;
        ref.m1();
        ref = objB;
        ref.m1();
        ref = objC;
        ref.m1();

    }
}

// output
// class A
// class B
// class C
