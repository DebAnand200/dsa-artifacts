package java_8.coding_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Join_List_Of_Streams_With_Prefix_Suffix_Delimeter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "mango", "apple", "orange", "mango", "mango");
        String joined = list.stream().collect(Collectors.joining(" , ", "[ ", " ]"));
        System.out.println(joined); // [ apple , mango , apple , orange , mango , mango ]
    }
}
