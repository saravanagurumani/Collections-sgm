package Method_Referance;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Sample {
    String name;
    Character initial;
    String dept;


    public  Sample(String name, Character initial) {
        this.name = name;
        this.initial = initial;

    }

    public Sample(String dept, String name) {
        this.dept = dept;
        this.name = name;
        System.out.println(name + "  - " + dept);
    }

//    @Override
//    public String toString() {
//        return  name  + " " +  initial;
//    }

    @Override
    public String toString() {
        return "Sample{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    public Sample() {
    }

    public String isPrime(int a, int b){
        if(a<b){
            return b+ " is Big";
        }else return a + " is Big";
    }

    public static void main(String[] args) {
        Sample samObj=new Sample();
        BiFunction<Integer,Integer,String> bi=samObj::isPrime;
        String res=bi.apply(20,30);
        System.out.println(res);

        //Parametar Constructor
        BiFunction<String,Character,Sample> bi1=Sample::new;
        Sample res1=bi1.apply("saravana",'G');
        System.out.println(res1);

        //With lambda Experstions
        BiConsumer<String,String> bicon=(a,b)->{
            System.out.println(a + b);
        };
        bicon.accept("saro","gm");

        //with Method referance
        BiConsumer<String,String> bime=Sample::new;
        bime.accept("CSE","saravana");


//        SgmFun<String,String> sg=Sample::new;
//        sg.read("CSE","saro");

    }
}
