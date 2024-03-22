package java_8.coding_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Merge_Two_Unsorted_Arrays_into_Single_Sorted_Arrays {
    public static void main(String[] args) {
       int[] nums1 = {1,4,3,2,5,7,6,8,9,10};
       int[] nums2 = {11,10,9,44,33,22,55,77,66,88};
        int[] array = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).sorted().toArray();
        System.out.println(Arrays.toString(array)); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 10, 11, 22, 33, 44, 55, 66, 77, 88]

        int[] array1 = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(array1)); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 22, 33, 44, 55, 66, 77, 88]
    }
}
