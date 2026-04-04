import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamtut {
    public static void main(String[] args) {
        List <Integer> nums = Arrays.asList(4, 5, 6, 7, 9, 8);

        nums.forEach(n -> System.out.println(n));

        // Stream <Integer> s1 = nums.stream();
        // //s1.forEach(n -> System.out.println(n));  // s1 is dead after this
        // Stream <Integer> s2 = s1.filter(n -> n % 2 == 0);
        // Stream <Integer> s3 = s2.map(n -> n*2);
        //  //s2.forEach(n -> System.out.println(n));
        //  s3.forEach(n -> System.out.println(n));

        int result = nums.stream()
                            .filter(n -> n%2==0)
                            .map(n -> n*2)
                            .reduce(0,(c, e) -> c+e);  // addition

        System.out.println(result);
        
        Stream<Integer> val = nums.stream().filter(n -> n%2==0)
                                        .map(n -> n*2)
                                        .sorted();
        //System.out.println(val);
        val.forEach(n -> System.out.println(n));
    }    
}
