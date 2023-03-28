//this program prints the numbers from 1 to 40 in two threads, one thread printing the odd numbers and the other thread printing the even numbers.

class EvenThread implements Runnable {
    public void run() {
        for (int i = 2; i <= 40; i += 2) {
            System.out.println("Even Thread: " + i);
        }
    }
}

class OddThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 40; i += 2) {
            System.out.println("Odd Thread: " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new EvenThread());
        Thread t2 = new Thread(new OddThread());

        t1.start();
        t2.start();
    }
}

// output (what is this output? ffs)
// Thread 1: 2
// Thread 2: 1
// Thread 1: 4
// Thread 2: 3
// Thread 1: 6
// Thread 2: 5
// Thread 1: 8
// Thread 2: 7
// Thread 1: 10
// Thread 2: 9
// Thread 1: 12
// Thread 2: 11
// Thread 1: 14
// Thread 2: 13
// Thread 1: 16
// Thread 2: 15
// Thread 1: 18
// Thread 2: 17
// Thread 1: 20
// Thread 2: 19
// Thread 1: 22
// Thread 2: 21
// Thread 1: 24
// Thread 2: 23
// Thread 1: 26
// Thread 2: 25
// Thread 1: 28
// Thread 2: 27
// Thread 1: 30
// Thread 2: 29
// Thread 1: 32
// Thread 2: 31
// Thread 1: 34
// Thread 2: 33
// Thread 1: 36
// Thread 2: 35
// Thread 1: 38
// Thread 2: 37
// Thread 1: 40
// Thread 2: 39
