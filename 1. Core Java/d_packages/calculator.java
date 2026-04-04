class Calculator{
    int a;                              // data members

    public int add(int a, int b){                   // method
        System.out.println("in add");
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }
}

public class calculator {
    public static void main(String a[]){
        int num1 = 4, num2 = 5;

        //Calculator calc;// just a reference;
        Calculator calc = new Calculator(); // creating an object

        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}
