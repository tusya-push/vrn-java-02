package ru.dataart.academy.java;

import org.junit.jupiter.api.Test;

public class LongestSubstringTest {

    @Test
    void test() {
        assert (LongestSubstring.getLengthOfLongestSubstring("") == 0);
        assert (LongestSubstring.getLengthOfLongestSubstring("a") == 1);
        assert (LongestSubstring.getLengthOfLongestSubstring("aa") == 1);
        assert (LongestSubstring.getLengthOfLongestSubstring("bbbb") == 1);
        assert (LongestSubstring.getLengthOfLongestSubstring("abcabcbb") == 3);
        assert (LongestSubstring.getLengthOfLongestSubstring("pwwkew") == 3);
        assert (LongestSubstring.getLengthOfLongestSubstring("babad") == 3);
        assert (LongestSubstring.getLengthOfLongestSubstring("wkewl") == 4);
        assert (LongestSubstring.getLengthOfLongestSubstring("pww") == 2);
        assert (LongestSubstring.getLengthOfLongestSubstring("eabcb") == 4);
        assert (LongestSubstring.getLengthOfLongestSubstring("abba") == 2);
    }

}
