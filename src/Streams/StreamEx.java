package Streams;

import java.lang.ref.PhantomReference;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamEx {
    String name;
    String lname;

    public StreamEx() {
    }

    public StreamEx(String name, String lname) {
        this.name = name;
        this.lname = lname;
    }

    public void stream1(){
        Stream<Integer> s1= Stream.of(23,43,55,12,90,56,59);
        Stream<Integer> s2=s1.filter((x)->x>50);
        s2.forEach((x)-> System.out.println(x)); //this is lambda method
//        s2.forEach(System.out::println); //this is method reference
    }

    public void stream2(){
        Stream<Long> s2=Stream.generate(()-> Math.round(Math.random()*100));
//        s2.mapToInt(x->x)
        s2.filter(x->x%10==0)
            .limit(10)
//                    .filter(x->x%5==0)
            .forEach(System.out::println);
    }

    public static void main(String[] args) {
        StreamEx obj=new StreamEx();
//        obj.stream1();
        obj.stream2();


    }
}
