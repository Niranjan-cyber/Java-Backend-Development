package n_thread;

class A extends Thread {
    // every thread class must have a run method

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class C implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class D implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class thread_priv {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj2.getPriority());
        obj1.setPriority(10);
        obj1.setPriority(Thread.MAX_PRIORITY); // just suggesting the scheduler

        obj1.start();
        obj2.start();

        // we can only optimize it

        Runnable obj3 = new C(); // runnable object
        Runnable obj4 = new D();
        Thread t1 = new Thread(obj3);
        Thread t2 = new Thread(obj4);
        t1.start();
        t2.start();
        System.out.println("Done !");

        // using lamda expression to reduce this
        Runnable obj5 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        Runnable obj6 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        Thread t3 = new Thread(obj3);
        Thread t4 = new Thread(obj4);
        t3.start();
        t4.start();
        System.out.println("Done !");
    }
}
