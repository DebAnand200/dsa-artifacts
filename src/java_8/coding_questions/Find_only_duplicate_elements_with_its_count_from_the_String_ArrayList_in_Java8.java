package java_8.coding_questions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_only_duplicate_elements_with_its_count_from_the_String_ArrayList_in_Java8 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC", "DD", "BB", "CC", "DD", "BB", "CC", "DD", "BB", "CC", "DD", "BB", "CC", "DD", "BB");
        Map<String, Long> map = names.stream()
                .filter(x -> Collections.frequency(names, x) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("map = " + map);

    }
}
