class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i <= 50) {
            System.out.println("Cooking...");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i <= 50) {
            System.out.println("Reading..");
            i++;
        }
    }
}

public class threadClass {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();

        thread1.start();
        thread2.start();
    }
}
