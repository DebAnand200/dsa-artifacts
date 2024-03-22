package neetcode.arrays_n_strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {3,3,4};
        System.out.println( majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        //BruteForce
//        Arrays.sort(nums);
//        return nums[nums.length/2];

        //HashMap TC:O(n) SC:O(n)

//        HashMap<Integer, Integer> map = new HashMap<>();
//        int res = 0;
//        int maxCount = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
//            int curr = map.get(nums[i]);
//            if(curr > maxCount){
//                res = nums[i];
//            }
//            maxCount = Math.max(maxCount, map.get(nums[i]));
//        }
//        return res;

        //Boyer-Moore Majority Voting Algorithm TC:O(n) SC:O(1)
       int res = 0;
       int count = 0;
        for (int i=0; i< nums.length; i++) {

            if (count == 0){
                res = nums[i];
            }
            count += (res == nums[i])? 1: -1;
        }
        return res;
    }
}
