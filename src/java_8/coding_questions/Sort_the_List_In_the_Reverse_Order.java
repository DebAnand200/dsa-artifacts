package java_8.coding_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_the_List_In_the_Reverse_Order {
    public static void main(String[] args) {
        List<Integer> listOfInts = Arrays.asList(12, 23, 34, 90, 89, 78, 56, 45, 34, 32, 43, 65);
        List<Integer> sortedList = listOfInts.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList); // [90, 89, 78, 65, 56, 45, 43, 34, 34, 32, 23, 12]

        List<Character> listOfChars = Arrays.asList('a', 'b', 'c', 'v', 's', 'd', 'e', 'f', 'g', 'h');
        List<Character> sortedCharList = listOfChars.stream().sorted((a, b) -> (b - a)).collect(Collectors.toList());
        System.out.println(sortedCharList); // [v, s, h, g, f, e, d, c, b, a]

        List<String> listOfString = Arrays.asList("deb", "deepak", "subhasis", "satyajit", "srinu", "atulya", "basu");
        List<String> sortedStringList = listOfString.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedStringList); // [subhasis, srinu, satyajit, deepak, deb, basu, atulya]
    }
}
