class Mobile{
    String brand;
    int price;
    static String name; // shared by all the objects
    
    public Mobile(String brand, int price, String name) {
        this.brand = brand;
        this.price = price;
        Mobile.name = name; // static should be accessed by class name shared by all the objects
    }

    public void show(){
        System.out.println(brand + " "+ price + " "+ name);
    }

    // static method
    public static void show1(){
        // we can only use static variables inside static method
        System.out.println(name + " in a static method");
    }
}

public class mobile {
    public static void main(String a[]){
        Mobile obj1 = new Mobile("apple", 70000, "iphone 16");
        Mobile obj2 = new Mobile("apple", 80000, "iphone 17");
        Mobile.name = "ipad";
        obj1.show();
        obj2.show();

        Mobile.show1(); // static method using the class name
    }
}
