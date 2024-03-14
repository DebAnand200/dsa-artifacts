package neetcode.arrays_n_strings;

public class Length_of_Last_Word {
//    https://leetcode.com/problems/length-of-last-word/description/
    public static void main(String[] args) {

    }

    public static int lengthOfLastWord(String s) {
        int i = s.length()-1;
        int len = 0;
        //while loop to iterate backwards throught the string as long as the current
        // char is space. This skips any trailing spaces
        while (s.charAt(i) == ' '){
            i -= 1;
        }
        //while loop to count after the with the abobe loop i reaches at an actual char not space
        //it count the chars till the next space
        while (i >= 0 && s.charAt(i) != ' '){
            len += 1;
            i -= 1;
        }

        return len;
    }

}
