package java_8.coding_questions;

import java.util.stream.IntStream;

public class Pallindrom_Program_in_Java_8 {
    public static void main(String[] args) {
        String str = "madamz";
        boolean isPallindrome = IntStream.rangeClosed(0, str.length() / 2)
                .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
        System.out.println(isPallindrome); //true
    }
}
