package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：Tong
 * @date ：Created in 2020/3/30 16:58
 * @description： 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * @version: $
 */
public class Top_3LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;

        Map<Character, Integer> map = new HashMap<>();
        int max = 0;

        while (right < s.length()) {
            char currCh = s.charAt(right);
            right++;
            map.put(currCh, map.getOrDefault(currCh, 0) + 1);

            while (map.get(currCh) > 1) {
                char leftCh = s.charAt(left);
                left++;
                map.put(leftCh, map.get(leftCh) - 1);
            }
            max = Math.max(max, right - left);
        }
        return max;
    }
}
