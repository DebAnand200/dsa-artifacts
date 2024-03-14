package neetcode.arrays_n_strings;

import java.util.HashMap;

public class Valid_Anagram {
//    https://leetcode.com/problems/valid-anagram/description/
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        //heck first if length is ame or diff
        //create 2 HMAPs for s and t and the store key as char and val as their occurance count
        // if both HMAPs individual chars occurent count matches then ret true
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x: s.toCharArray()) {
            map.put(x, map.getOrDefault(x,0)+1);
        }

        for (char x: t.toCharArray()) {
            map.put(x, map.getOrDefault(x,0)-1);
        }

            //travserse the HashMap by key and check if both the hashmaps contains
            // equal no of chars and count
        for (int val: map.values()) {
            if(val != 0){
                return false;
            }
        }
        return true;
    }
}
