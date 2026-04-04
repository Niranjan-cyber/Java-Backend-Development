package h_wrapper_class;

public class demo {
    public static void main(String[] args) {
        int num = 7;

        // this is called boxing
        // Integer num1 = new Integer(8); //depreciated
        Integer num1 = 8; // boxing happens automatically so autoboxing

        num = num1.intValue();  // auto-unboxing

        String str = "12";
        int num3 = Integer.parseInt(str);

        System.out.println(num);
        System.out.println(num3 * 2);
    }
}
