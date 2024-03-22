package java_8.coding_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Second_Largest_No_In_An_Ineger_Array {
    public static void main(String[] args) {
        List<Integer> listOfInts = Arrays.asList(1, 4, 2, 3, 6, 7, 8, 9);
        Integer secondLargest = listOfInts.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargest); // 8

    }
}
