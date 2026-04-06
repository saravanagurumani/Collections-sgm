package Streams.streams_tasks.main_tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentTask1 {

    public static void gettopperstudent(List<Student> list){
        Map<String,List<String>> map=list.stream().filter(
                        a->a.getSubject1()>=150 &&
                                a.getSubject2()>=150 &&
                                a.getSubject3()>=150 &&
                                a.getSubject4()>=150 &&
                                a.getSubject5()>=150)
                .collect(Collectors.groupingBy(c->c.getDepartment(),Collectors.mapping(d->d.getName(),Collectors.toList())));
        System.out.println(map);
    }

    /*

    */
    public static void getrank(List<Student> list){

    }

    public static void main(String[] args) {

                Student stu1=new Student("Rajesh","MCA",123,170,148,90,190);
                Student stu2=new Student("Amar","MCA",169,154,181,190,170);
                Student stu3=new Student("Roshni","MCA",129,120,158,100,111);
                Student stu4=new Student("Priyan","MBA",165,180,108,150,109);
                Student stu5=new Student("Dinesh","MBA",123,170,188,156,160);
                Student stu6=new Student("Kalyan","MBA",190,190,198,178,180);
                Student stu7=new Student("Jasma","MSc",123,100,88,190,90);
                Student stu8=new Student("Usha","MSc",123,190,178,76,100);
                Student stu9=new Student("Jeevan","MSc",123,180,189,124,170);

        List<Student> list= Arrays.asList(stu1,stu2,stu3,stu4,stu5,stu6,stu7,stu8,stu9);
        StudentTask1.gettopperstudent(list);

    }
}
