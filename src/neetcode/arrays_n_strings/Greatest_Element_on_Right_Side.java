package neetcode.arrays_n_strings;

public class Greatest_Element_on_Right_Side {
//    https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/

    public static void main(String[] args) {

    }

    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = getMax(arr, i+1);
        }
        arr[arr.length-1] = -1;
        return arr;
    }

    public int getMax(int[] arr, int start) {
        int max = Integer.MIN_VALUE;

        for (int i = start; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
