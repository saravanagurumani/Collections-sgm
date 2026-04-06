package collections.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashsetTest {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for (int i = 1; i <20 ; i++) {
            if(i==10){
                set.add(null);
                continue;
            }
            set.add(i);
        }

        System.out.println(set);
    }
}
