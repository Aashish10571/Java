class MyThreadConstructor extends Thread {
    MyThreadConstructor(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread work..");
    }
}

class MyThreadConstructor1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread 1 work..");
    }
}

public class threadConstructors {
    public static void main(String[] args) {
        MyThreadConstructor thread = new MyThreadConstructor("Aashish");
        thread.start();

        System.out.println("name : " + thread.getName());
        System.out.println("id : " + thread.getId());

        MyThreadConstructor1 threadConstructor1 = new MyThreadConstructor1();
        Thread thread1 = new Thread(threadConstructor1, "Aashish");

        thread1.start();

        System.out.println("name : " + thread1.getName());
    }
}
