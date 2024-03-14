package neetcode.arrays_n_strings;

import java.util.HashSet;

public class Contains_Duplicate {
//    https://leetcode.com/problems/contains-duplicate/description/
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        //create a HasSet,check if it exists in the set and if not then
        // store the array element inside, compare the length of thw array and set
        //else return true;
        HashSet<Integer> set = new HashSet<>();
        for (int n: nums) {
            if (set.contains(n)) {
                return true;
            }
            set.add(n);
        }
        return !(set.size() == nums.length);
    }
}
