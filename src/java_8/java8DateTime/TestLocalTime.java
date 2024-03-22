package java_8.java8DateTime;

import java.time.LocalTime;

public class TestLocalTime {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime customTime = LocalTime.of(12, 4);
        LocalTime parsedTime = LocalTime.parse("15:50:12");
        LocalTime beforeOneHour = now.minusHours(2);
        System.out.println(now); //15:04:50.303632100
        System.out.println(customTime); //12:04
        System.out.println(parsedTime); //15:50:12
        System.out.println(beforeOneHour); //13:16:02.725124500

        if(now.isAfter(beforeOneHour)){
            System.out.println("Yes");
        }


    }
}
