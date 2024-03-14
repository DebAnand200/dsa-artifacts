package arrays;

import java.util.Arrays;

public class Richest_Customer_Wealth {
//    https://leetcode.com/problems/richest-customer-wealth/description/
    public static void main(String[] args) {
        int[][] accounts = {
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int indTotal = 0;
            for (int j = 0; j <accounts[i].length ; j++) {
                indTotal += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, indTotal);
        }
        return maxWealth;
    }
}
