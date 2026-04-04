package k_lambda;
 
interface A{
    void show(int i);
}
interface B{
    int add(int i, int j);
}

public class demo {
    public static void main(String[] args) {
        // A obj = new A(){
        //     public void show(){
        //         System.out.println("hello");
        //     }
        // };

        // lambda
        A obj = (i) -> {   // no need to mention the variable type
                System.out.println("in show " + i);
        };
        obj.show(5);

        B obj1 = (i, j) -> i + j;
        int result = obj1.add(3, 4);
        System.out.println(result);

        // lambda methods works only with only functional interface 
    }
}
