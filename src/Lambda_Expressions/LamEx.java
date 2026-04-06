package Lambda_Expressions;


import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class LamEx {
    public static void main(String[] args) {
        Practice pre=new Practice();
        System.out.println("Normal Class Implementation : " + pre.test(12));

        //Way 2 using anonymous implemetation
        Predicate<Integer> pre1= new Predicate<>(){

            @Override
            public boolean test(Integer o) {
                if (0<o){
                    return true;
                }
                else
                    return false;
            }
        };
        System.out.println("Anonymous Class Implementation : "+ pre1.test(2));

        //Way 3 using in Lambda Function
        Predicate<Integer> pre2= (a)-> a<0?true:false;

        System.out.println("Lambda Function Implementation : "+ pre2.test(3));

        //Useing Bipredicate Functional interfaces

        BiPredicate<Integer,Integer> bipre=new BiPredicate<>() {

            @Override
            public boolean test(Integer o, Integer o2) {
                return true;
            }
        };
        System.out.println("Bipredicate : " + bipre.test(2,9));


        // Function interface default and sataic methods

        Function<String,String> fun=x->"Hello" + x;
        Function<String,String> fun1=x->"User" + x;
        String res=fun.andThen(fun1).compose(fun1).apply("saravana");
        System.out.println("default " + res);

    }
    
//    Pojoclass pojo=new Pojoclass();

}


//Way 1 using noraml implemetaion
class Practice implements Predicate<Integer> {

    @Override
    public boolean test(Integer a) {
        return a%2==0;
    }
}