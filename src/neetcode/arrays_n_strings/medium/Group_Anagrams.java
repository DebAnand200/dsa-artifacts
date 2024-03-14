package neetcode.arrays_n_strings.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> res = new HashMap<>();
        for (String s: strs) {
            Map<Character, Integer> count = new HashMap<>();
            for (Character c: s.toCharArray()) {
                count.put(c, count.getOrDefault(c,0) + 1);
            }
            res.putIfAbsent(count, new ArrayList<>());
            res.get(count).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
