package problem121;

import java.util.Arrays;

public class Solution121 {

    public static int maxProfit(int[] prices) {
        int result = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                result = Math.max(result, prices[i] - minPrice);
            }
        }
        return result;
    }

    public static int[] inputNums() {
        int[] inputArray = {7, 1, 5, 3, 6, 4};
        return inputArray;
    }

    public static void printAnswer(int[] nums) {
        System.out.println(maxProfit(nums));
    }

    public static void run() {
        printAnswer(inputNums());
    }

}
