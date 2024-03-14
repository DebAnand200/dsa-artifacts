package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Check_if_the_Sentence_Is_Pangram {
    public static void main(String[] args) {
        String sentence = "leetcode";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        Set<Character> set= new HashSet<>();
        char[] arr = sentence.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return (set.size() == 26);
    }
}
