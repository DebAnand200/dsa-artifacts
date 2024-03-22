package java_8.coding_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Print_multiples_of_5_From_the_List {
    public static void main(String[] args) {
        List<Integer> listOfInts = Arrays.asList(2, 4, 3, 6, 7, 8, 9);
        List<Integer> multipliedInts = listOfInts.stream().map(x -> x * 5).collect(Collectors.toList());
        System.out.println(multipliedInts); // [10, 20, 15, 30, 35, 40, 45]
    }
}
