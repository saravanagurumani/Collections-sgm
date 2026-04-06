package Streams;

import java.util.*;

public class StreamSample2 {

    public static void method1(){
        List<Integer> list1= Arrays.asList(5,6,7,8,9);
        List<Integer> list2= Arrays.asList(10,11,12,13,14);
        List<Integer> list3= Arrays.asList(1,2,3,4,5);

        List<List<Integer>> l=Arrays.asList(list1,list2,list3);
        System.out.println(l);
        l.stream().flatMap(x->x.stream()).distinct().sorted().forEach(System.out::println);
    }

    public static void method2(){
        Map<Integer,String> map=new HashMap<>();
        map.put(2,"saro");
        map.put(1,"lakshu");
        map.put(3,"ilakki");
        map.put(5,"kaviya");
        map.put(4,"ravi");
        System.out.println(map);
        map.entrySet().stream().forEach(e-> System.out.println(e.getKey() + " -> " + e.getValue()));

    }
    public static void main(String[] args) {
//        StreamSample2.method1();
        StreamSample2.method2();
    }
}
