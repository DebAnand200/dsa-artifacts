package java_8.coding_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Three_Max_Min_Number_From_List {
    public static void main(String[] args) {
        List<Integer> listOfNums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 10, 11, 22, 33, 44, 55, 66, 77, 88);
        //Min 3 Numbers
        List<Integer> min3List = listOfNums.stream().sorted().limit(3).collect(Collectors.toList());

        System.out.println(min3List); // [1, 2, 3]

        //Max 3 Numbers
        List<Integer> max3List = listOfNums.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println(max3List); // [88, 77, 66]

    }
}
