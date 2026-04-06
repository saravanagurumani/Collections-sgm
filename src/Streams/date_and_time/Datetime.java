package Streams.date_and_time;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class Datetime {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);
        LocalTime time=LocalTime.now(Clock.systemDefaultZone());
        System.out.println("Clock : " + time);
        LocalTime date1=LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println("Zone : " + date1);
        LocalTime date2=LocalTime.now();
        System.out.println(" Local :" +date2);

        LocalDate date3=LocalDate.parse("2002-04-10");
        System.out.println(date3);
    }
}
