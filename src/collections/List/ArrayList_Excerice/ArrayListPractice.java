package collections.List.ArrayList_Excerice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {

    public static void printList(List<?  > list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

        public static void main(String[] args) {
        List alist=new ArrayList<>();
        List names = Arrays.asList("Saro", "Kaviya",100,true);

        alist.add("saro");
        alist.add("kaviya");
        alist.add("lakshu");
        alist.add(100);

//        System.out.println(alist);
//        System.out.println(names);
        printList(names);



//        alist.add(2,"selva");
//        System.out.println(alist);
//
//        alist.collections.List.set(2,"anu");
//        System.out.println(alist);
//
//        System.out.println(alist.contains("anu"));
    }
}
