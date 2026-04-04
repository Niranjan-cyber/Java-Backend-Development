package l_exception_handling;

class A{
    public void show() throws ClassNotFoundException{
        // try{
        //     Class.forName("calc");
        // }
        // catch(ClassNotFoundException e){
        //     System.out.println("Not able to find the class" + e);
        // }
        Class.forName("calc");
    }
}

public class throws_demo {
    public static void main(String[] args) {
        
        A obj = new A();
        try {
            obj.show();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();    // can see the entire stack
        }

    }
}
