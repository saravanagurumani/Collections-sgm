package collections.set.hashset;

import java.util.HashSet;
import java.util.Objects;

class Student{
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno,name);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(obj == null || getClass()!=obj.getClass()) return false;

        Student s = (Student) obj;

        return rollno == s.rollno &&
                Objects.equals(name,s.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Student> stu=new HashSet<>();
        Student s1=new Student(101,"saro");
        Student s2=new Student(102,"lakshu");
        Student s3=new Student(103,"ilakki");
        Student s4=new Student(101,"saro");
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        System.out.println(stu);
    }
}
