package collections.queue;

import java.util.PriorityQueue;

class Student{
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
public class PriorityqueueEx {
    public static void main(String[] args) {
        PriorityQueue<Student> stu=new PriorityQueue<>((a,b)-> a.rollno - b.rollno);
        stu.add(new Student(104,"aaro"));
        stu.add(new Student(101,"lakshu"));
        stu.add(new Student(102,"kaviya"));
        System.out.println(stu);

    }
}
