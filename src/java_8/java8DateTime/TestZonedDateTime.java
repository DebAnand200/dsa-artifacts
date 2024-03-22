package java_8.java8DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class TestZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now); // 2024-03-14T15:21:56.279405100+05:30[Asia/Calcutta]
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        availableZoneIds.forEach(System.out::println);
        ZonedDateTime customZDTime = ZonedDateTime.of(2000, 12, 1, 14, 30, 30, 50, ZoneId.of("America/Costa_Rica"));
        System.out.println(customZDTime); // 2000-12-01T14:30:30.000000050-06:00[America/Costa_Rica]
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(newYorkTime); // 2024-03-14T05:57:58.249198200-04:00[America/New_York]
        System.out.println(newYorkTime.getZone()); //America/New_York


    }
}
