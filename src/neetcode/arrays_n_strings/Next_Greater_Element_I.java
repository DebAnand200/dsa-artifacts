package neetcode.arrays_n_strings;

import java.util.*;

public class Next_Greater_Element_I {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,2,4};
        int[] nums2 = {6,5,4,3,2,1,7};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //O(n+m)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }

        int[] arr = new int[nums1.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums2.length; i++) {
            int cur = nums2[i];
            while (!stack.isEmpty() && (cur > stack.peek())){
                int val = stack.pop();
                int idx = map.get(val);
                arr[idx] = cur; // cur is the next greater element
                if(map.containsKey(cur))
                    stack.push(cur);
            }
        }

        // O(n*m)
        for (int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i])){
                for(int j = i+1; j < nums2.length; j++) {
                   if(nums2[j] > nums2[i]) {
                       arr[map.get(nums2[i])] = nums2[j];
                       break;
                   }
                }
            }
        }
        return arr;
    }
}
