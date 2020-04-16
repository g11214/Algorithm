package Hot100;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/1 17:05
 * @description：
 * @version: $
 */
public class Top_20IsValid {
    public boolean solution(String s) {
        if(s.length()<=1){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');

        for (int i = 1; i < s.length(); i++) {
            if (!stack.isEmpty()) {
                if (!map.containsKey(stack.peek())) {
                    return false;
                }
                if (map.get(stack.peek()).equals(s.charAt(i))) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
