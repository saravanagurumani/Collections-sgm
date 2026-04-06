package Method_Referance;

import java.util.function.Function;

public class Student {

    String StuName;

    @Override
    public String toString() {
        return "Student{" +
                "StuName='" + StuName + '\'' +
                '}';
    }

    //Instance Method
    public String names(String name){
        return ("Instance Method : " + name);
    }

    //Static method
    public static int roll(int no){
        return  no;
    }

    //Default Constructor
    public Student() {
        System.out.println("Student Default Constructor");
    }

    //Parameter Constructor
    public Student(String stuName) {
        StuName = stuName;
    }

    public static void main(String[] args) {
        Student stu=new Student();
//        stu.names("saro");

        //Method Referance
//        Function<String,String> fun=stu::names; //instance method
//        String res=fun.apply("saro");
//        System.out.println(res);

        Function<Integer,Integer> fun1=Student::roll;
        int res= fun1.apply(23);
        System.out.println("Static method : " + res);

        Function<String,Student> fun3=Student::new;
        Student res1=fun3.apply("saravana");
        System.out.println("Parameter Constructor : " + res1.toString());
    }
}
