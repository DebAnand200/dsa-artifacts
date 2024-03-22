package java_8.coding_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Separate_Odd_and_Even_Numbers {
    public static void main(String[] args) {
        List<Integer> listOfNums = Arrays.asList(12, 43, 23, 45, 34, 56, 45, 67, 87, 89, 49, 90);
        Map<Boolean, List<Integer>> map = listOfNums.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(map); // {false=[43, 23, 45, 45, 67, 87, 89, 49], true=[12, 34, 56, 90]}
    }
}
