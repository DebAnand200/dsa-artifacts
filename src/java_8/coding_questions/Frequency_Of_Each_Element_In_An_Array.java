package java_8.coding_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency_Of_Each_Element_In_An_Array {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "mango", "apple", "orange", "mango", "mango");
        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
