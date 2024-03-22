package java_8.coding_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Find_Duplicate_Elements_From_An_Array {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "U", "U", "E", "E", "F", "A");
        Set<String> set = new HashSet<>();
        Set<String> setDuplicates = list.stream()
                .filter(i -> !set.add(i))
                .collect(Collectors.toSet());
        System.out.println(setDuplicates);
    }
}
