package java_8.coding_questions;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Age_Of_Person_In_Years {
    public static void main(String[] args) {
        LocalDate bday = LocalDate.of(1998, 06, 10);
        LocalDate now = LocalDate.now();

        System.out.println(ChronoUnit.DECADES.between(bday, now) + " DECADES"); // 2 DECADES
        System.out.println(ChronoUnit.YEARS.between(bday, now) + " YEARS"); // 25 YEARS
        System.out.println(ChronoUnit.MONTHS.between(bday, now) + " MONTHS"); // 309 MONTHS
        System.out.println(ChronoUnit.WEEKS.between(bday, now) + " WEEKS"); // 1344 WEEKS
        System.out.println(ChronoUnit.DAYS.between(bday, now) + " DAYS"); // 9413 DAYS
    }
}
