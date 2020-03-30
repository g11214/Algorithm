package Top1To10;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：Tong
 * @date ：Created in 2020/3/30 16:58
 * @description：
 * @version: $
 */
public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        int len = s.length();
        Set<Character> set = new HashSet<>();

        int maxLen = 0, leftIndex = 0, rightIndex = 0;

        while (rightIndex < len) {
            if (set.add(s.charAt(rightIndex++))) {
                int length = rightIndex - leftIndex + 1;
                if (maxLen < length) {
                    maxLen = length;
                }
            } else {
                set.remove(leftIndex);
                leftIndex++;
            }
        }
        return maxLen;
    }
}
