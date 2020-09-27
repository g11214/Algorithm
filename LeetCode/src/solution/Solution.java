package solution;

import java.util.*;

class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();
        if (s == null || s.length() == 0) {
            ans.add("");
            return ans;
        }
        HashSet<String> set = new HashSet<>();  //用于存储裁剪后的元素，防止重复元素加入队列

        int size = getStack(s).size();

        Deque<String> queue = new ArrayDeque<>();
        queue.offer(s);

        while (!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                String curr = queue.poll();
                if(isValid(curr)){
                    ans.add(curr);
                }
                if(size == 0){
                    continue;
                }
                for (int j = 0; j < curr.length(); j++) {
                    if (curr.charAt(j) == '(' || curr.charAt(j) == ')') {
                        String nextStr = curr.substring(0, j) + curr.substring(j + 1);
                        if (set.add(nextStr)) { //如果集合中还未有该字符串
                            queue.offer(nextStr);
                        }
                    }
                }
            }
            size--;
        }
        return ans;
    }

    private boolean isValid(String s) {
        return getStack(s).size() == 0;
    }

    public Deque<Character> getStack(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char currCh = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == '(' && currCh == ')') {
                stack.pop();
                continue;
            }
            if (currCh != '(' && currCh != ')') {
                continue;
            }
            stack.push(currCh);
        }
        return stack;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        long start = System.currentTimeMillis();
        System.out.println(test.removeInvalidParentheses("((()((s((((()"));//
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}