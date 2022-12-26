package problem724;

import java.util.Arrays;

public class Solution724 {
    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;

        for (int n:nums) {
            rightSum += n;
        }

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];

            if(rightSum == leftSum) return i;

            leftSum += nums[i];
        }

        return -1;
    }

    public static int[] inputNums(){
        int[] inputArray = {1,7,3,6,5,6};
        return inputArray;
    }

    public static void printAnswer(int[] nums) {
        System.out.println(pivotIndex(nums));
    }

    public static void run() {
        printAnswer(inputNums());
    }
}
