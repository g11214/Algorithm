package swordtooffer;

import java.util.HashMap;

/**
 * @description:
 * @author: Tong
 * @date: 2020-04-06 21:06
 */
public class FirstNotRepeatingChar {
    public int solution(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        HashMap<Character, Integer> map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                int time = map.get(str.charAt(i));
                map.put(str.charAt(i), ++time);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        int pos = -1;
        int i = 0;
        for (; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        return pos;
    }
}
