package java_8.coding_questions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sum_Of_All_Digits_Of_A_Number {
    public static void main(String[] args) {
        int num = 1111111;
        Integer sum = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum); // 7
    }
}
