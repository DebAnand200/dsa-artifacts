package java_8.coding_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Common_Elements_Between_Two_Arrays {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "B", "C", "D", "E");
        List<String> list2 = Arrays.asList("AB", "B", "CD", "DE", "E");
        List<String> unionList = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(unionList); // [B, E]
    }
}
