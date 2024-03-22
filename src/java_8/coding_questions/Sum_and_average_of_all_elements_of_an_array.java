package java_8.coding_questions;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Sum_and_average_of_all_elements_of_an_array {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 23, 56, 78, 90, 10};

        //Sum
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum); //348

        //Average
        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println(avg); //43.5

    }
}
