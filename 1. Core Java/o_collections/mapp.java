package o_collections;

import java.util.HashMap;
import java.util.Map;

public class mapp {
    public static void main(String[] args) {
        Map <Integer, Integer> mp = new HashMap<>();
        mp.put(0, 23);
        mp.put(2, 19);

        System.out.println(mp.get(0));
        System.out.println(mp);
        System.out.println(mp.keySet());

        for (int key : mp.keySet()){
            System.out.println(key + " " + mp.get(key));
        }
    }
}
