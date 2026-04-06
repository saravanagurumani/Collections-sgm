package Streams.date_and_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DateTimeTask2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a year :");
        int year=scan.nextInt();
        System.out.println("Enter a Month :");
        int month= scan.nextInt();
        LocalDate d=LocalDate.of(year,month,1);
        for (int i = 1; i <=d.lengthOfMonth() ; i++) {
            LocalDate local=LocalDate.of(year,month,i);
            DayOfWeek day=local.getDayOfWeek();
//            System.out.print(local.getDayOfWeek() + "  ");
            if(day==(DayOfWeek.SUNDAY)){
                System.out.println(i + "\t");
            }
            else
                System.out.print(i+"\t");
        }
    }
}
