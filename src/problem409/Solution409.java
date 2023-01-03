package problem409;

import java.util.HashMap;

public class Solution409 {
    public static int longestPalindrome(String s) {

        if(s == null || s.length() == 0)
            return 0;

        int result = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();
        boolean odd = false;
        for (String str : s.split("")) {
            hashMap.put(str, hashMap.getOrDefault(str, 0) + 1);
        }

        for (String str : hashMap.keySet()) {
            if (hashMap.get(str) % 2 == 0) {
                result += hashMap.get(str);
            } else {
                if (odd) {
                    if(hashMap.get(str) > 1) result += hashMap.get(str) - 1;
                } else {
                    result += hashMap.get(str);
                    odd = true;
                }
            }
        }
        return result;
    }

    public static void printAnswer() {
//        String s = "abccccdd";
        String s = "a";
        System.out.println(longestPalindrome(s));
    }

    public static void run() {
        printAnswer();
    }

}
