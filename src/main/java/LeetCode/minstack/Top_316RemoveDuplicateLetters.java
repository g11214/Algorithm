package LeetCode.minstack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：Tong
 * @description：给你一个仅包含小写字母的字符串，请你去除字符串中重复的字母，使得每个字母只出现一次。需保证返回结果的字典序最小（要求不能打乱其他字符的相对位置）。 示例 1:
 * <p>
 * 输入: "bcabc"
 * 输出: "abc"
 * 示例 2:
 * <p>
 * 输入: "cbacdcbc"
 * 输出: "acdb"
 * @date ：2020/9/9 10:31
 */
public class Top_316RemoveDuplicateLetters {
    public String removeDuplicateLetters(String text) {
        if (text == null || text.length() == 0) return text;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char curr = text.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < text.length(); i++) {
            char curr = text.charAt(i);
            if (stack.contains(curr)) {
                map.put(curr, map.get(curr) - 1);
                continue;
            }
            while (!stack.isEmpty() && curr <= stack.peek() && map.get(stack.peek()) > 1) {
                char popCh = stack.pop();
                map.put(popCh, map.get(popCh) - 1);
            }
            stack.push(curr);
        }

        int len = stack.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(stack.pollLast());
        }
        return sb.toString();
    }
}
