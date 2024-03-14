package neetcode.arrays_n_strings;

public class Is_Subsequence {
    public static void main(String[] args) {
        String  s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {

        if (s.length() > t.length()){
            return false;
        }
        if(s.length() == 0){
            return true;
        }
        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()){
            if (s.charAt(i) == t.charAt(j)){
                i += 1;
                j += 1;
            }else{
                j += 1;
            }
        }
        return i == s.length();
    }
}
