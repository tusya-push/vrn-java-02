package ru.dataart.academy.java;

public class LongestSubstring {

    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public static int getLengthOfLongestSubstring(String checkString) {
        int length = checkString.length();
        if (length == 0) return 0;
        if (length == 1) return 1;
        int result = 1;
        for (int i = 0; i < length; i++) {
            for (int j = i + 2; j <= length; j++) {
                char[] sub = new char[j - i];
                checkString.getChars(i, j, sub, 0);
                if (noDuplicate(sub) && sub.length > result)
                    result = sub.length;
            }
        }
        return result;
    }

    private static boolean noDuplicate(char[] sub) {
        int[] count = new int[128];
        for (char c : sub) {
            count[c]++;
            if (count[c] > 1) return false;
        }
        return true;
    }
}
