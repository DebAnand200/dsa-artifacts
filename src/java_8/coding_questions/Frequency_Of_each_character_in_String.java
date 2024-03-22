package java_8.coding_questions;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency_Of_each_character_in_String {
    public static void main(String[] args) {
        String name = "debananda";
        Map<Character, Long> map = name.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map); // {a=3, b=1, d=2, e=1, n=2}
    }
}
