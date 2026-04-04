package a_inheritence;

class AdvancedCalculator extends Calculator{
    public int multi(int a, int b){
        return a * b;
    }
    public int div(int a, int b){
        return a / b;
    }
}

public class advcalc {
    public static void main(String[] args) {
        AdvancedCalculator obj = new AdvancedCalculator();
        int r1 = obj.add(4, 4);
        int r2 = obj.sub(4, 4);
        int r3 = obj.multi(4, 4);
        int r4 = obj.div(4, 4);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}
