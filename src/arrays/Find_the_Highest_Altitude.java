package arrays;

public class Find_the_Highest_Altitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int max_so_far = 0;
        int max_final = 0;
        for (int i = 0; i < gain.length; i++) {
            max_so_far += gain[i];
            max_final = Math.max(max_final, max_so_far);
        }
        return max_final;
    }



}
