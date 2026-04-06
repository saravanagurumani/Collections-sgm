package collections.set.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        set.add(0);
        set.add(null);
        System.out.println(set);
    }
}
