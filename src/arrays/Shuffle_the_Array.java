package arrays;

import java.util.Arrays;

public class Shuffle_the_Array {
//    https://leetcode.com/problems/shuffle-the-array/
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        for (int i = 0; i < n; i++) {
            arr[2*i] = nums[i];
            arr[2*i+1] = nums[n+i];
        }
        return arr;
    }
}
