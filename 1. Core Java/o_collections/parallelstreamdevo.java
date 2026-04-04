import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class parallelstreamdevo {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<>(10000);

        Random ran = new Random();
        for (int i = 0;i  < 10000; i++) nums.add(ran.nextInt(100));

        
        int sum1 = nums.stream().map(n -> n *2).reduce(0, (c, e)->c+e);
        
        long t1 = System.currentTimeMillis();
        int sum2 = nums.stream().map(n -> n *2).mapToInt(i -> i).sum();
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);

        long t3 = System.currentTimeMillis();
        int sum3 = nums.parallelStream().map(n -> n *2).mapToInt(i -> i).sum();
        long t4 = System.currentTimeMillis();
        System.out.println(t4 - t3);

        System.out.println(sum1 + " " +sum2 + " " + sum3);
    }
}
