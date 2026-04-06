package BasicExcercise;

import java.util.ArrayList;
import java.util.Collections;

class StudentList implements Comparable<StudentList> {
    int stuId;
    String stuName;
    int batch;
    String course;

    public StudentList(int stuId, String stuName, int batch, String course) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.batch = batch;
        this.course = course;
    }

    @Override
    public String toString() {
        return "StudentList{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", batch=" + batch +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public int compareTo(StudentList o) {
        if (this.stuId>o.stuId){
            return 0;
        } else if (this.stuId<o.stuId) {
            return -1;
        }else
            return 0;
    }
}

public class UniqTech {
    public static void main(String[] args) {

      sort1();
    }
    private static void sort1(){
        StudentList stu1=new StudentList(11,"saravana",55,"java");
        StudentList stu2=new StudentList(6,"lakshu",65,".Net");
        StudentList stu3=new StudentList(4,"kaviya",57,"python");
        StudentList stu4=new StudentList(5,"anu",58,"Testing");
        ArrayList<StudentList>arr=new ArrayList<>();
        arr.add(stu1);
        arr.add(stu2);
        arr.add(stu3);
        arr.add(stu4);
        System.out.println("Before Sorting");
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println("After Sorting");
        System.out.println(arr);

    }
}