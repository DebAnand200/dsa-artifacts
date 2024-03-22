package java_8.coding_questions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram_Program_In_Java_8 {
    public static void main(String[] args) {
        String s1 = "tea";
        String s2 = "eat";

        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.println(s1.equals(s2)); // true
    }
}
