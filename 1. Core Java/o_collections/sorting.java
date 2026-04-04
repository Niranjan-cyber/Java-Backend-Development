package o_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sorting  {
    public static void main(String[] args) {

        Comparator <Integer>comp = new Comparator<>() {
            public int compare(Integer i,Integer j){
                if ((i % 10) > (j % 10)) return 1;
                else return -1;
            }
        };
        
        List <Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(72);
        nums.add(31);
        nums.add(19);

        Collections.sort(nums);
        System.out.println(nums);

        // custom sort;
        Collections.sort(nums, comp);
        System.out.println(nums);
    }
}
