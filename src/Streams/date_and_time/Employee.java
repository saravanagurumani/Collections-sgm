package Streams.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private LocalDate joingingDate;
    private LocalDate RelivingDate;

    public Employee() {
    }

    public Employee(int id, String name, String dept ,LocalDate joingingDate, LocalDate relivingDate) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.joingingDate = joingingDate;
        RelivingDate = relivingDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", joingingDate=" + joingingDate +
                ", RelivingDate=" + RelivingDate +
                '}';
    }

    public LocalDate getJoingingDate() {
        return joingingDate;
    }

    public void setJoingingDate(LocalDate joingingDate) {
        this.joingingDate = joingingDate;
    }

    public LocalDate getRelivingDate() {
        return RelivingDate;
    }

    public void setRelivingDate(LocalDate relivingDate) {
        RelivingDate = relivingDate;
    }

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        List<Employee> employees = Arrays.asList(
                new Employee(101, "Lakshu", "IT",
                        LocalDate.parse("10-04-2020", formatter),
                        LocalDate.parse("10-04-2045", formatter)),
                new Employee(102, "Kalyan", "HR",
                        LocalDate.parse("15-05-2020", formatter),
                        LocalDate.parse("15-05-2022", formatter)),
                new Employee(103, "Roshni", "Finance",
                        LocalDate.parse("20-06-2018", formatter),
                        LocalDate.parse("20-06-2021", formatter)),
                new Employee(104, "Amar", "IT",
                        LocalDate.parse("25-07-2021", formatter),
                        LocalDate.parse("25-07-2024", formatter)),
                new Employee(105, "Priya", "Marketing",
                        LocalDate.parse("30-08-2017", formatter),
                        LocalDate.parse("30-08-2020", formatter)),
                new Employee(106, "Jeevan", "Finance",
                        LocalDate.parse("05-09-2016", formatter),
                        LocalDate.parse("05-09-2019", formatter)),
                new Employee(107, "Usha", "HR",
                        LocalDate.parse("12-10-2015", formatter),
                        LocalDate.parse("12-10-2018", formatter)),
                new Employee(108, "Dinesh", "IT",
                        LocalDate.parse("18-11-2022", formatter),
                        LocalDate.parse("18-11-2025", formatter)),
                new Employee(109, "Rajesh", "Marketing",
                        LocalDate.parse("22-12-2014", formatter),
                        LocalDate.parse("22-12-2017", formatter)),
                new Employee(110, "Anita", "Finance",
                        LocalDate.parse("01-01-2013", formatter),
                        LocalDate.parse("01-01-2016", formatter))
        );


//        Map<LocalDate,String> map=employees.stream()
//                .collect(Collectors.groupingBy(emp->emp.joingingDate,Collectors.mapping(x->x.getName(), Collectors.joining(",","{","}"))));
//        System.out.println(map);

        //print the employee with serving longest of all
//        Map<Long,String> map=employees.stream()
//                .collect(Collectors.groupingBy(emp->ChronoUnit.YEARS.between(emp.joingingDate,emp.getRelivingDate()),Collectors.mapping(x->x.getName(), Collectors.joining(",","{","}"))));
//        System.out.println(map);

        long years=employees.stream()
                .mapToLong(emp->ChronoUnit.YEARS.between(emp.getJoingingDate(),emp.getRelivingDate()))
                .max()
                .orElse(0);

        employees.stream()
                .filter(x-> ChronoUnit.YEARS.between(x.getJoingingDate(),x.getRelivingDate())==years)
                .forEach(out->System.out.println(years + " Years " + " -> " + out.getName()));


        //print all the employee average serving durations
        Double average= employees.stream()
                .collect(Collectors.averagingLong(emp->ChronoUnit.YEARS.between(emp.getJoingingDate(),emp.getJoingingDate())));
        System.out.println(average);


        //grouping employee by joining years
       Map<Integer,List<String>> map= employees.stream()
                .collect(Collectors.groupingBy(e->e.getJoingingDate().getYear(),Collectors.mapping(x->x.getName(),Collectors.toList())));
        System.out.println(map);

        //grouping seniors by each department
//        employees.stream()
//                .collect(Collectors.groupingBy(e->e.getDept(),Collectors.maxBy()));
//

    }
}
