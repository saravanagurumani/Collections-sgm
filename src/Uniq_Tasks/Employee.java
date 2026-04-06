package Uniq_Tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private String city;
    private int age;

    public Employee() {
    }

    public Employee(int id, String name, String department, double salary, String city, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.city = city;
        this.age = age;
    }

    public static void main(String[] args) {
        Integer a[] ={0,1,5,3,9,0,7,8,9,0};
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
    }
}
