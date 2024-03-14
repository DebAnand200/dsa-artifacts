package arrays;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {
//    Kids With the Greatest Number of Candies
    public static void main(String[] args) {
        int candies[] = {12,1,12};
        int extraCandies = 10;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = getMax(candies);

        for (int i = 0; i < candies.length; i++) {
            if((candies[i]+extraCandies) >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }

    private static int getMax(int[] candies) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        return max;
    }


}
