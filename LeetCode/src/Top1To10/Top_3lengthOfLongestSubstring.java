package Top1To10;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author ：Tong
 * @date ：Created in 2020/3/30 16:58
 * @description：
 * @version: $
 */
public class Top_3lengthOfLongestSubstring {
    public int solution(String s) {
        int len = s.length();
        Set<Character> set = new LinkedHashSet<>();
        int maxLen = 0, leftIndex = 0, rightIndex = 0;

        while (rightIndex < len) {
            if (set.add(s.charAt(rightIndex))) {
                rightIndex++;
                int length = rightIndex - leftIndex;
                if (maxLen < length) {
                    maxLen = length;
                }
                rightIndex++;
            } else {
                set.remove(s.charAt(leftIndex));
                leftIndex++;
            }
        }
        return maxLen;
    }

    public static int solution2(String s) {
        int len = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0, leftIndex = 0;

        for (int rightIndex = 0; rightIndex < len; rightIndex++) {
            char currChar = s.charAt(rightIndex);
            //存在重复
            if (map.containsKey(currChar)) {
                //重复值是否小于左边界，小于说明未重复继续put，大于说明重复，取重复值右边一位索引重新作为左边界
                leftIndex = Math.max(leftIndex,map.get(currChar)+1);
            }
            map.put(currChar, rightIndex);
            maxLen = Math.max(rightIndex - leftIndex + 1, maxLen);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(solution2("tmmzuxt"));
    }
}
