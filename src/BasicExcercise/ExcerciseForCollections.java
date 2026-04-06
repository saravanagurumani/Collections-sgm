package BasicExcercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcerciseForCollections {
    public static void main(String[] args) {
        List<String> col=new ArrayList<>();
        col.add("hello");
        col.add("world");
        col.add("saro");

        Collections.sort(col);
        System.out.println(col);
    }
}



