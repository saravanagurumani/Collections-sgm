//only the words that are palindromes

package Streams.streams_tasks;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> arr=List.of("level", "hello", "madam", "world", "noon");
        arr.stream().filter(x->x.equalsIgnoreCase(new StringBuilder(x).reverse().toString()))
                .forEach(System.out::println);

    }
}
