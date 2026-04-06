package Streams;

import Method_Referance.Sample;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SampleStream {

    //1-100 randam values in range of 10
    public static void methodtoprint(){
        Stream<Long> s1= Stream.generate(()->Math.round(Math.random()*101));
        s1.limit(10)
                .forEach(System.out::println);
    }

    //user custom value with range og 10
    public static void methoduserprint(int range){
        Stream<Long>s=Stream.generate(()->Math.round((Math.random()*range)+1));
                s.limit(10)
                        .forEach(System.out::println);
    }

    //print 1 to 50  that output is 1-odd 2 even etc..,
    public static void methododdoreven(int value){
        Stream<Integer>s=Stream.iterate(1,i->i+1);
        s.limit(value)
                .map(x-> x + (x%2==0 ? " - Even":" - Odd"))
                .forEach(System.out::println);
    }

    //concat the string
    public static void methodconcat(){
        
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the range value : ");
//        int range=scan.nextInt();
        int value= scan.nextInt();
//        SampleStream.methodtoprint();
//        SampleStream.methoduserprint(range);
        SampleStream.methododdoreven(value);
    }
}
