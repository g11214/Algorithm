package solution.minstack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 同316题
 */
public class Top_1081SmallestSubsequence {
    public String smallestSubsequence(String text) {
        if(text == null || text.length() == 0) return text;
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < text.length(); i++){
            char curr = text.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }

        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < text.length(); i++){
            char curr = text.charAt(i);
            if(stack.contains(curr)){
                map.put(curr, map.get(curr) - 1);
                continue;
            }
            while(!stack.isEmpty() && curr <= stack.peek() && map.get(stack.peek()) > 1){
                char popCh = stack.pop();
                map.put(popCh, map.get(popCh) - 1);
            }
            stack.push(curr);
        }
        int len = stack.size();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++){
            sb.append(stack.pollLast());
        }
        return sb.toString();
    }
}