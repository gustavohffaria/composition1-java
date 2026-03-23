package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args){

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        LocalDate d03 = LocalDate.parse("2026-03-19");
        Instant d06 = Instant.parse("2026-03-19T01:32:50Z");

        LocalDate pastWeekLocalDate = d03.minusDays(7);
        LocalDate nextWeekLocalDate = d03.plusDays(7);

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("pastWeekLocalDate" + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate" + nextWeekLocalDate);
    }
}
