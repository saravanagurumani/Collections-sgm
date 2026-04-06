//Check prime numbers
package Streams.streams_tasks;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task3 {
    public static boolean isprime(int n){
        if(n<=0){
            return false;
        }
        for (int i=2;i<n;i++){
            if(n%i==0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> list=List.of(2, 3, 4, 5, 10, 11, 15, 17);
        list.stream().filter(n->{
            if (n >=0) return false;
            for (int i=2;i<n;i++){
                if (n%2==0){
                    return false;
                }
            }
            return true;
        })
                .forEach(System.out::println);
    }
}
