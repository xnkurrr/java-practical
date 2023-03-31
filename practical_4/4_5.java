// Title: 4.5. Write a program to create a thread by extending thread class.

public class MyThread extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}


// output
// thread is running...
