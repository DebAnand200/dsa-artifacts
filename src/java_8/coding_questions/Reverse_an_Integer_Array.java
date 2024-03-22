package java_8.coding_questions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Reverse_an_Integer_Array {
    public static void main(String[] args) {
        int[] arr = {12, 32, 34, 45, 76, 87, 89, 90};
        int[] array = IntStream.rangeClosed(1, arr.length)
                .map(i -> arr[arr.length - i])
                .toArray();
        System.out.println(Arrays.toString(array));
    }
}
