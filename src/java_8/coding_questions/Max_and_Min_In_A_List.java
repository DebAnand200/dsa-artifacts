package java_8.coding_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Max_and_Min_In_A_List {
    public static void main(String[] args) {
        List<Integer> listOfNums = Arrays.asList(1, 3, 2, 4, 6, 5, 7, 8, 9);
        Optional<Integer> max = listOfNums.stream().max(Comparator.naturalOrder());
        Optional<Integer> min = listOfNums.stream().min(Comparator.naturalOrder());
        System.out.println("Max: "+max.get()); //9
        System.out.println("Min: "+min.get()); //1
    }
}
