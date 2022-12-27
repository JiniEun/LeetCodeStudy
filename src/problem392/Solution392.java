package problem392;

public class Solution392 {

    public static boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int index = 0;

        if (sLen == 0) {
            return true;
        }

        for (int j = 0; j < t.length(); j++) {
            if (s.charAt(index) == t.charAt(j)) {
                index += 1;
                if (index == sLen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void printAnswer() {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static void run() {
        printAnswer();
    }
}
