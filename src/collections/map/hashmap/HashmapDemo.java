package collections.map.hashmap;

import java.util.HashMap;

public class HashmapDemo {
    static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("sgm",1);
        map.put("lakshu",2);
        map.put("suji",3);
        System.out.println(map.get("suji"));
    }
}
