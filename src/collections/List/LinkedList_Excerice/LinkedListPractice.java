package collections.List.LinkedList_Excerice;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("saro");
        list.add("lakshu");
        list.add("kaviya");
        list.add("anu");
        System.out.println("Before : " +list);
        list.addFirst("sgm");
        System.out.println("After : " +list);
        System.out.println("This is peek : " + list.peek());
        System.out.println("This is peekFirst : " + list.peekFirst());
        System.out.println(list);
        System.out.println("This is poll : " + list.pollFirst());
        System.out.println(list);
        System.out.println("This is Pop : " + list.pop());
        System.out.println(list);
        list.push("kaviya");
        System.out.println(list);
    }
}
