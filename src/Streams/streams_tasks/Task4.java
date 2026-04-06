package Streams.streams_tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("java", "stream", "powerful", "api", "rocks");
        String res=list.stream().max(Comparator.comparingInt(String::length))
                .orElse("No value");
        System.out.println(res);
    }
}
