package Streams.streams_tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10, 20, 30, 20, 40, 10, 50);
        Map<Integer,Integer> map=new HashMap<>();
        list.forEach(x->map.put(x, map.getOrDefault(x,0)+1));
        map.entrySet().stream().filter(i->i.getValue()>1)
                .forEach(r-> System.out.println(r.getKey() + " - " + r.getValue() + " times"));
    }
}
