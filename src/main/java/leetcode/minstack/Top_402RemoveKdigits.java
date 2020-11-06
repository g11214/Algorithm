package leetcode.minstack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 */
public class Top_402RemoveKdigits {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < num.length(); i++) {
            while (!stack.isEmpty() && stack.peek() > num.charAt(i) && k > 0) {
                k--;
                System.out.println(stack.pop());
            }
            stack.push(num.charAt(i));
        }
        //如果k多出来，说明删少了，直接从后面删
        for (int i = 0; i < k; i++) {
            stack.pop();
        }

        StringBuilder sb = new StringBuilder();
        int len = stack.size();
        for (int i = 0; i < len; i++) {
            if (sb.length() == 0 && stack.peekLast() == '0') {
                stack.pollLast();
                continue;
            }

            sb.append(stack.pollLast());
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
