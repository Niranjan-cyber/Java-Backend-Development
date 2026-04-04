class Human{
    private int age = 19; // no one in the outside can use it
    private String name = "niranjan";

    // constructor 
    public Human(){             // to handle constructors

    }
    
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        // age = age;  preference given to the local variable
        
        this.age = age;  // specifying the instance variable and tells
                        //  we are using the current object
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // to use the data they must be permitted through methods
    // public void setAge(int a){      // setter
    //     age = a;
    // }

    // public void setName(String s){
    //     name = s;
    // }

    // public int getAge(){        // getter
    //     return age;
    // }
    // public String getname(){
    //     return name;
    // } 
}

public class human {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.age = 11;
        // obj.name = "niranjan";
        obj.setAge(20);
        obj.setName("niranjan iyer");

        System.out.println(obj.getName() + " " + obj.getAge());

        Human h = new Human(12,"John");
        System.out.println(h.getName() + " " + h.getAge());
    }
}
