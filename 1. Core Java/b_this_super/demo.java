class A{
    public A() {
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in A int");
    }
}

class B extends A{
    public B(){
        System.out.println("in B");
    }
    public B(int n){
        // super(); // default
        //super(n);  // to call paramaterised constructor of A
        this(); // execute the constructor of this class super and this both cant be there
        System.out.println("in B int");
    }
}

public class demo {
    public static void main(String[] args) {
        B obj = new B(3);
        obj.notify();
    }
}
