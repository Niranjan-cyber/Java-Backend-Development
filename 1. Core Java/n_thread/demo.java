package n_thread;

class A extends Thread{
    // every thread class must have a run method

    public void run(){
        for (int i = 0;i < 100; i++){
            System.out.println("hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0;i < 100; i++){
            System.out.println("hello");
        }
    }
}

public class demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        // thread is created
        obj1.start();  // executes the run method
        obj2.start();

        // it is executing parallely and it is random
        // scheduler - allows the thread to execute
    }
}
