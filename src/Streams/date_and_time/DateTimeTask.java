package Streams.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class DateTimeTask {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a date (E.g : 2025-12-01):");
        String date=scan.next();
        LocalDate d=LocalDate.parse(date);
        for (int i = d.getDayOfMonth(); i < d.lengthOfMonth() ; i++) {
            System.out.println(d.getDayOfWeek() + " , " + d.getDayOfMonth() + ", " + d.getMonth() + " ," + d.getYear());
            d=d.plusDays(1);
        }
    }
}
