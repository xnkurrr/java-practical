// Title: 4.6 - Implementing Runnable Interface

public class MyThread implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread thread = new Thread(obj);
        thread.start();
    }
}

// output
// Thread is running...
