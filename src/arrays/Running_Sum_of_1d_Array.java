package arrays;

import java.util.Arrays;

public class Running_Sum_of_1d_Array {
//    https://leetcode.com/problems/running-sum-of-1d-array/description/
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = sum + nums[i];
            sum += nums[i];
        }
        return arr;
    }
}
