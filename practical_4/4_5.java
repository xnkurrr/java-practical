// Title: 4.5. Write a program to create a thread by implementing Runnable interface.

class Main implements Runnable {
    public static void main(String[] args) {
        Main m1 = new Main();
        Thread t1 = new Thread(m1);
        t1.start();
    }

    public void run() {
        System.out.println("thread is running...");
    }
}

// output
// thread is running...
