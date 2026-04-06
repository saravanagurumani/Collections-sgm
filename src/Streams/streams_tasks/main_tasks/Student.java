package Streams.streams_tasks.main_tasks;

public class Student {
    private String name;
    private String Department;
    private int Subject1;
    private int Subject2;
    private int Subject3;
    private int Subject4;
    private int Subject5;

    public Student() {
    }

    public Student(String name, String department, int subject1, int subject2, int subject3, int subject4, int subject5) {
        this.name = name;
        Department = department;
        Subject1 = subject1;
        Subject2 = subject2;
        Subject3 = subject3;
        Subject4 = subject4;
        Subject5 = subject5;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", Department='" + Department + '\'' +
                ", Subject1=" + Subject1 +
                ", Subject2=" + Subject2 +
                ", Subject3=" + Subject3 +
                ", Subject4=" + Subject4 +
                ", Subject5=" + Subject5 +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getSubject1() {
        return Subject1;
    }

    public void setSubject1(int subject1) {
        Subject1 = subject1;
    }

    public int getSubject2() {
        return Subject2;
    }

    public void setSubject2(int subject2) {
        Subject2 = subject2;
    }

    public int getSubject3() {
        return Subject3;
    }

    public void setSubject3(int subject3) {
        Subject3 = subject3;
    }

    public int getSubject4() {
        return Subject4;
    }

    public void setSubject4(int subject4) {
        Subject4 = subject4;
    }

    public int getSubject5() {
        return Subject5;
    }

    public void setSubject5(int subject5) {
        Subject5 = subject5;
    }
}
