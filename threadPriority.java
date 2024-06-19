class MyThread3 extends Thread {
    MyThread3(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("hello there " + this.getName());
    }
}

public class threadPriority {
    public static void main(String[] args) {
        MyThread3 thread1 = new MyThread3("Aashish");
        MyThread3 thread2 = new MyThread3("Srijana");
        MyThread3 thread3 = new MyThread3("Sudip");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
