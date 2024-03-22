package neetcode.arrays_n_strings;

public class Find_Pivot_Index {
    public static void main(String[] args) {
        int[] nums = {2,1,-1};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int idx = -1;
        for (int i = 0; i < nums.length; i++) {
            int sumLeft = rangeSum(nums, 0, i-1);
            int sumRight = rangeSum(nums, i+1, nums.length-1);
            if(sumLeft == sumRight) idx = i;
        }
        return idx;
    }

    public static int rangeSum(int[] nums, int start, int end) {
        int sum = 0;
        if(end<0){
            end = 0;
        }
        if(start == end){
            return 0;
        }
        for (int i = start; i <= end; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
