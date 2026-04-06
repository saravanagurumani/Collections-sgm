package Optional_Class;

import org.w3c.dom.ls.LSOutput;

import java.io.StringReader;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;

public class OptionalEx {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

//        String[] name=new String[5];
//
//        for(int i=0;i<name.length;i++){
//            System.out.println("Enetr the value : ");
//            name[i]=scan.next();
//        }
//
//        System.out.println(name);

//        Optional<String> opt=Optional.empty();
//        System.out.println(opt);

        //of method if value is there means return that value.if value is null means show NullPointerException.
        /*
        Optional<String> opt=Optional.of(null);
        String res=opt.get();
        System.out.println(res);
         */


        Optional<String> opt=Optional.ofNullable("hello");
        System.out.println(opt);
        Optional<String> obj1=opt.map(x->x.toUpperCase());
        Optional<Integer> obj3=obj1.map(x->x.length());
        obj3.ifPresent(x-> System.out.println(x));
        System.out.println(opt);

//        Optional<String> opt1=Optional.ofNullable("hello");
//        System.out.println(opt);
//        Optional<String> obj1=opt.map(x->x.toUpperCase());
//        Optional<Integer> obj3=obj1.map(x->x.length());
//        obj3.ifPresent(x-> System.out.println(x));
//        System.out.println(opt);


    }
}
