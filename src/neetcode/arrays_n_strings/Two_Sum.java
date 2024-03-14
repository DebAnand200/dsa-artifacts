package neetcode.arrays_n_strings;

import java.util.HashMap;

public class Two_Sum {
//    https://leetcode.com/problems/two-sum/description/
    public static void main(String[] args) {
        int[] nums = {2,7,11,15}; int target = 9;
    }

    public static int[] twoSum(int[] nums, int target) {
        //Bruteforce O(n*n)
//        int[] arr  = {-1, -1};
//        for (int i = 0; i < nums.length; i++) {
//
//            for (int j = 0; j < nums.length; j++) {
//                if(i != j && nums[j] == target - nums[i]){
//                    arr[0] = i;
//                    arr[1] = j;
//                }
//            }
//        }
//        return arr;

        //One Pass Solution TC:O(n) SC:O(n)
        int[] arr = {-1, -1};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                arr[0] = i;
                arr[1] = map.get(target - nums[i]);
            }else{
                map.put(nums[i], i);
            }
        }
        return arr;
    }
}
