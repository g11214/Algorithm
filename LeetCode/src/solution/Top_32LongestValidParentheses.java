package solution;

import java.util.ArrayDeque;
import java.util.Deque;
/**
 * @description: 给定一个只包含 '('和 ')'的字符串，找出最长的包含有效括号的子串的长度。
 *
 * 示例1:
 *
 * 输入: "(()"
 * 输出: 2
 * 解释: 最长有效括号子串为 "()"
 * 示例 2:
 *
 * 输入: ")()())"
 * 输出: 4
 * 解释: 最长有效括号子串为 "()()"
 */
public class Top_32LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(!stack.isEmpty() && curr == ')' && s.charAt(stack.peek()) == '('){
                stack.pop();
                int left = 0;
                if(!stack.isEmpty()){
                    left = stack.peek() + 1;
                }
                int right = i;
                maxLength = Math.max(maxLength, right - left + 1);
                continue;
            }
            stack.push(i);
        }
        
        return maxLength;
    }
}