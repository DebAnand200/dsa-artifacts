package neetcode.arrays_n_strings;

public class Longest_Common_Prefix {
//    https://leetcode.com/problems/longest-common-prefix/description/
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        String s = "";
        String word = strs[0];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if(c == strs[j].charAt(i)){
                    s += c;
                }
            }
        }
        return s;
    }
}
