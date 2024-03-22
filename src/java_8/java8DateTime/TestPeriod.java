package java_8.java8DateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class TestPeriod {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate then = LocalDate.of(1998, 06, 10);
        Period age = Period.between(then, now);
//        Duration ageDur = Duration.between(then, now); // Unsupported unit: Seconds
        System.out.println(age); // P25Y9M4D


    }
}
