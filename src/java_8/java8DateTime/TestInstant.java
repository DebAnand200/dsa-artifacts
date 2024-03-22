package java_8.java8DateTime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class TestInstant {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis); // 1710410454963 //he difference, measured in milliseconds, between the current time and midnight, January 1, 1970 UTC.

        Instant now = Instant.now();
        System.out.println(now); // 2024-03-14T10:02:13.358439700Z Nanosec UTC(Z)
        long epochSecond = now.getEpochSecond();
        System.out.println(epochSecond); //1710410633
        System.out.println(now.atZone(ZoneId.of("America/New_York"))); // 2024-03-14T06:03:53.695312100-04:00[America/New_York]


        Instant start = Instant.now();
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        Instant end = Instant.now();
        Duration d1 = Duration.between(start, end);
        Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(d1); // PT0S // PT0.0121223S
        System.out.println(d2); // PT1H
        int i = d2.compareTo(d1);
        System.out.println(i); //-13263300

        Duration between = Duration.between(LocalDateTime.now(), LocalDateTime.now().minusMinutes(36));
        System.out.println(between); // PT0S

    }
}
