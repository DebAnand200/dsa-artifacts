package neetcode.arrays_n_strings;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic_Strings {
    public static void main(String[] args) {
        String s = "bar";
        String t = "foo";
        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> st = new HashMap<>();
        Map<Character, Character> ts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(st.containsKey(s.charAt(i)) && st.get(s.charAt(i)) != t.charAt(i) || ts.containsKey(t.charAt(i)) && ts.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }
            st.put(s.charAt(i), t.charAt(i));
            ts.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }
}
