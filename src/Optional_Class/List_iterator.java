package Optional_Class;

import java.awt.*;
import java.util.*;
import java.util.List;

public class List_iterator {
    public static void main(String[] args) {
        List<String> ref=new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add(null);
        list1.add("B");
        list1.add("C");
        ListIterator<String> li=list1.listIterator();   // |A|B|C|
//        while(li.hasNext()){
//            String res=li.next();
////            System.out.println(res);
//
//            if(res.equals("B")){
//                li.remove();
//            }
//        }
//        System.out.println("After Remove : " + list1);
        /*System.out.println(li.nextIndex());
        System.out.println(li.next());
        System.out.println(li.nextIndex());
        System.out.println(li.next());
        System.out.println(li.nextIndex());
        System.out.println(li.next());
        System.out.println(li.nextIndex());

         */
        System.out.println(li.previousIndex());
//        li.remove();
        System.out.println(li.next());
        System.out.println(li.next());
//       li.collections.List.set("T");
//        System.out.println(list1);


    }
}
