package i_abstract;

abstract class Car{
    // abstract method can only belong to the abstract class
    public abstract void drive(); // just declaring 
    public abstract void fly();

    public void playMusic(){
        System.out.println("Playing Music");
    }
}

class WagonR extends Car{
    // you must define all the abstract methods

     public void drive(){
        System.out.println("Drive");
     }
    
     public void fly(){
        System.out.println("fly");
     }
}

public class demo {
    public static void main(String[] args) {
        // you cant create an object of an abstract class;
        Car obj = new WagonR();  
        // notice you can create reference of it;
        obj.drive();
        obj.playMusic();
    }
}
