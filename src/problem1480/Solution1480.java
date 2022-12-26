package problem1480;

import java.util.Arrays;

public class Solution1480 {

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];

        result[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }

    public static int[] inputNums(){
        int[] inputArray = {1, 2, 3, 4};
        return inputArray;
    }

    public static void printAnswer(int[] nums) {
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static void run() {
        printAnswer(inputNums());
    }

}
