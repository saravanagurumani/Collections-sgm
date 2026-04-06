package Streams.collectors;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsSample {
    public static void main(String[] args) {
        String[] arr={"one","two","three","four","five"};

        //this is one of the method using for joining method
        /*String str=Arrays.stream(arr).collect(Collectors.joining(" - "));
        System.out.println(str);*/

//        Arrays.stream(arr).collect(Collector.of(StringBuilder::new));
    }
}
