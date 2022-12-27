package problem205;

import java.util.HashMap;

public class Solution205 {

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap();

        int stringLen = s.length();
        for (int i = 0; i < stringLen; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (i != 0) {
                if (map.containsKey(sChar)) {
                    if (map.get(sChar) != tChar) {
                        return false;
                    }
                } else if (map.containsValue(tChar)) {
                    return false;
                }
            }
            map.put(sChar, tChar);
        }
        return true;
    }

    public static void printAnswer() {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }

    public static void run() {
        printAnswer();
    }
}
