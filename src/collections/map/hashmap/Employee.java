package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Employee{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    static void main(String[] args) {
        Employee emp1 = new Employee(1, "John Doe", 50000);
        Employee emp2 = new Employee(2, "Jane Smith", 60000);
        Employee emp3=new Employee(3,"lakshman",70000);
        HashMap<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(emp1.id,emp1);
        employeeMap.put(emp3.id, emp3);
        employeeMap.put(emp2.id, emp2);
//        System.out.println(employeeMap);

         //This is the one of the method to iterator using values()
//        for(Employee emp : employeeMap.values()){
//            System.out.println(emp);
//        }

        //This is for using keyset()
//        for(Integer key : employeeMap.keySet()){
//            System.out.println(key + " -> " + employeeMap.get(key) );
//        }

        //This is for using entryset()
        for(Map.Entry<Integer,Employee> entry : employeeMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

}
