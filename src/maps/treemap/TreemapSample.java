package maps.treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class TreemapSample {
    public static void main(String[] args) {
        TreeMap<Integer,String> tree=new TreeMap<>();
        tree.put(1,"saravana");
        tree.put(2,"lakshu");
        tree.put(3,"kaviya");
        tree.put(4,"ravi");
        tree.put(5,"dhanam");

        System.out.println(tree.get(5));

        for (int key : tree.keySet()){
            System.out.println("Keys : " + key);
        }

        for(String value: tree.values()){
            System.out.println("Values : " + value);
        }

        //pair the keys and values
        for(Map.Entry<Integer,String> entry : tree.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        ArrayList arr=new ArrayList();
    }
}
