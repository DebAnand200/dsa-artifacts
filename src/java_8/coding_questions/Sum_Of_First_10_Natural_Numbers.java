package java_8.coding_questions;

import java.util.stream.IntStream;

public class Sum_Of_First_10_Natural_Numbers {
    public static void main(String[] args) {
        int sum = IntStream.range(1, 11).sum();
        System.out.println(sum);
    }
}
