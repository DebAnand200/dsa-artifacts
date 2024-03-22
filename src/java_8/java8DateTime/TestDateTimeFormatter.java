package java_8.java8DateTime;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestDateTimeFormatter {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate parse = LocalDate.parse("2024-03-14");
        System.out.println(parse); //2024-03-14
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format = today.format(myFormatter);
        System.out.println(format); // 14/03/2024
        LocalDate parse1 = LocalDate.parse("10/06/1998", myFormatter);
        System.out.println(parse1); //1998-06-10

        String dateTimeString = "2024-03-14 10:30:45 IST";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        ZonedDateTime parse2 = ZonedDateTime.parse(dateTimeString, dateTimeFormatter);
        System.out.println(parse2); //2024-03-14T5:30:45Z[Africa/Abidjan]

//        String dateTimeString1 = "2024-03-14 10:30:45";
//        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssXXX");
//        ZonedDateTime parse3 = ZonedDateTime.parse(dateTimeString1, dateTimeFormatter1);
//        System.out.println(parse3); //2024-03-14T5:30:45Z[Africa/Abidjan]


    }
}
