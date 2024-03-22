package java_8.java8DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TestLocalDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today); // 2024-03-14

        LocalDate myDate = LocalDate.of(1998, 06, 10);
        System.out.println(myDate); //1998-06-10

        System.out.println(today.getDayOfMonth()); // 14
        System.out.println(today.getMonth()); // MARCH
        System.out.println(today.getYear()); // 2024

        LocalDate yesterDay = today.minusDays(1);
        LocalDate pastdate = today.minusMonths(12);

        System.out.println(today); //2024-03-14
        System.out.println(yesterDay); //2024-03-13
        System.out.println(pastdate); //2023-03-14

        if (today.isAfter(yesterDay)){
            System.out.println("Han Bhai");
        }
    }
}
