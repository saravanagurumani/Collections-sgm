package collections.set.enumset;

import java.util.EnumSet;

enum Day{
    MON,TUE,WED,THU,FRI,SAT,SUN;
}
public class EnumPractice {
    public static void main(String[] args) {
        EnumSet<Day> day1= EnumSet.allOf(Day.class);
        EnumSet<Day> day2= EnumSet.of(Day.MON,Day.SUN);
        EnumSet<Day> day3= EnumSet.noneOf(Day.class);
        EnumSet<Day> day4= EnumSet.range(Day.MON,Day.FRI);
        System.out.println(day1);
        System.out.println(day2);
        System.out.println(day3);
        System.out.println(day4);
    }
}
