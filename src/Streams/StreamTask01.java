package Streams;

import java.util.Arrays;

public class StreamTask01 {

    //Task - 1
    public static void method1(){
        String[] wordsList = {"welcome to java", "The The is programming language", "Compare to python java is more readable"};
        Arrays.stream(wordsList)
                .flatMap(x->Arrays.stream(x.split(" ")).distinct())
                .forEach(System.out::println);
    }


    public static void method2(){
        String[] wordsList = {"welcome to java", "The The is programming language", "Compare to python java is more readable"};
        Arrays.stream(wordsList)
                .flatMap(x->Arrays.stream(x.split(" ")).distinct().map(i->{
                            StringBuilder str=new StringBuilder(i.substring(0,1).toUpperCase()+ i.substring(1).toLowerCase());
                            return str.reverse();
                        })).forEach(System.out::println);
    }
    public static void main(String[] args) {
//        StreamTask01.method1();
        StreamTask01.method2();
    }
}
