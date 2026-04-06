package collections.List;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<String> s= new Stack<>();
        s.push("saro");
        s.push("lakshu");
        s.push("mamu");
        System.out.println(s);

//        for(int i=0;i<s.toArray().length;i++){
//            System.out.println(s.peek());
//        }

        for(String s1 : s){
            System.out.println(s1);
        }
    }
}
