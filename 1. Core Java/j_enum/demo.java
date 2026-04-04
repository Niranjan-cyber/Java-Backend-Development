package j_enum;

enum Status{  // status is the class
    Running, Failed, Success, Pending;  // all these are objects and are called named
}

public class demo {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal()); // will print the number of the object used
        
        Status[] ss = Status.values(); // returns an array
    }
}
