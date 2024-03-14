package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Create_Target_Array_in_the_Given_Order {
//    https://leetcode.com/problems/create-target-array-in-the-given-order/description/
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            // Insert nums[i] at index[index[i]] in target
            target.add(index[i], nums[i]);
        }

        // Convert List<Integers> to int[]
        int[] result = new int[target.size()];
        for(int i = 0; i<target.size(); i++){
            result[i] = target.get(i);
        }
        return result;
    }
}
