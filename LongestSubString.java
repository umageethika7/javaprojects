package abc;
import java.util.*;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubString obj = new LongestSubString();
        String s = "abcabcbb";
        System.out.println(obj.lengthOfLongestSubstring(s)); // Output: 3
    }
}
