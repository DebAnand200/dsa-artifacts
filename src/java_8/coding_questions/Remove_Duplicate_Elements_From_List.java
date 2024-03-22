package java_8.coding_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Duplicate_Elements_From_List {
    public static void main(String[] args) {
        List<String> fruitsList = Arrays.asList("apple", "mango", "apple", "orange", "mango", "mango");
        List<String> uniqueFruitsList = fruitsList.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueFruitsList); //[apple, mango, orange]
    }
}
