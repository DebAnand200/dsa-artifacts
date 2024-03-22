package java_8.coding_questions;

import java.util.Arrays;
import java.util.List;

public class Find_Strings_Which_Starts_With_A_Number {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("3Find 4Strings Which Starts 7With 8A 9Number");
        list.stream().filter(str -> Character.isDigit(str.charAt(0))).forEach(System.out::println);
    }
}
