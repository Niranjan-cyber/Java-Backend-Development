class Hello{
    public static void main(String a[]){
        System.out.println(3 + 2); // newline 
        System.out.println(67); // newline

        int num1 = 3; // = is the assignment operator
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(result);

        float marks = 6.5f; // either this or typecast, float is 4bytes
        double marks2 = 6.5; // (6.5) is considered double by default
        System.out.println(marks);
        System.out.println(marks2);

        boolean b =true;
        System.out.println(!b);

        char c = 'p';
        System.out.println(c);

        // literals
        // int num = 585;
        // int bin = 0b1010; // binary no.
        // int spacing = 100_00_00;

        // double eps = 1e10;
        // System.out.println(eps);
    }

}
