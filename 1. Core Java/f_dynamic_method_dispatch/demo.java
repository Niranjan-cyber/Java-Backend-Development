package f_dynamic_method_dispatch;

class A{
    public void show(){
        System.out.println("in show A");
    }
}
class B extends A{

}
class C extends A{

}

public class demo {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
