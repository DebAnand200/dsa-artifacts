package java_8.coding_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_List_of_Strings_In_Increasing_ordr_of_their_Length {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("deb", "anand", "deb", "deepak", "subhasis", "satyajit", "srinu", "atulya", "basu");
        List<String> sortedList1 = list.stream().sorted((a, b) -> (a.length() - b.length())).collect(Collectors.toList());
        System.out.println(sortedList1);  //[deb, deb, basu, anand, srinu, deepak, atulya, subhasis, satyajit]
        List<String> sortedList2 = list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(sortedList2);  //[deb, deb, basu, anand, srinu, deepak, atulya, subhasis, satyajit]

    }
}
