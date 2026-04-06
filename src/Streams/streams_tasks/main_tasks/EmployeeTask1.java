package Streams.streams_tasks.main_tasks;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeTask1 {
    public static void main(String[] args) {
        Employee emp=new Employee(101,"saro","Devloper",10000.0);
        Employee emp2=new Employee(102,"kaviya","Tester",15000.0);
        Employee emp3=new Employee(103,"lakshu","Devloper",100000.0);
        Employee emp4=new Employee(104,"ravi","Ui",450000.0);
        Employee emp5=new Employee(105,"anu","react",50000.0);
        Employee emp6=new Employee(106,"ilakki","python",65000.0);
        Employee emp7=new Employee(107,"mia","Devloper",120000.0);
        Employee emp8=new Employee(108,"sunny","tester",75000.0);
        Employee emp9=new Employee(109,"dani","bda",18000.0);
        Employee emp10=new Employee(110,"virat","ui",35000.0);
        Employee emp11=new Employee(111,"hardik","python",100000.0);


        //-> Find employees with salary > 50,000
        List<Employee> list= Arrays.asList(emp,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10,emp11);
//        list.stream().filter(a->a.salary>50000).forEach(System.out::println);

        //-> Group employees by department
        Map<String,List<Employee>>map=list.stream().collect(Collectors.groupingBy(a->a.department));
        System.out.println(map);

        //-> Find the highest-paid employee in each department
//       Optional<Double> opt= list.stream().collect(Collectors.maxBy(Comparator.comparing(c->c)))
    }
}
