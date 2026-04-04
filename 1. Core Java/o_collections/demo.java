package o_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        Collection <Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(4);

        System.out.println(nums);
        for (int n : nums) System.out.println(n);

        // use list for index based
        List <Integer> l = new ArrayList<>();   //List is and interface you cant create ibject of an interface
        l.add(4);
        l.add(5);
        l.add(6);

        System.out.println(l.get(1));
        System.out.println(l);
    }
}
