package java_8.java8DateTime;

import java.time.LocalDateTime;

public class TestLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); //2024-03-14T15:17:35.631574600

        LocalDateTime customDate = LocalDateTime.of(1998, 10, 06, 19, 0, 19);
        System.out.println(customDate); // 1998-10-06T19:00:19

        LocalDateTime parsedDate = LocalDateTime.parse("1998-10-06T19:00:19");
        System.out.println(parsedDate); //1998-10-06T19:00:19

    }


}
