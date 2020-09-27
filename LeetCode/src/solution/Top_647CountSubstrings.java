package solution;

/**
 * @author ：Tong
 * @date ：Created in 2020/5/9 16:52
 * @description： 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
 *
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。
 *
 * 示例 1:
 *
 * 输入: "abc"
 * 输出: 3
 * 解释: 三个回文子串: "a", "b", "c".
 * 示例 2:
 *
 * 输入: "aaa"
 * 输出: 6
 * 说明: 6个回文子串: "a", "a", "a", "aa", "aa", "aaa".
 * @version: $
 */
public class Top_647CountSubstrings {
    public int countSubstrings(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length * 2 - 1; i++) { // 对每个可能的回文中心进行循环
            int left = i / 2; // 当中心是两个字母的间歇时i%2 = 1；当中心是字母时 left==right都落在该字母的位置
            int right = left + i % 2;
            while(left >= 0 && right < chars.length && chars[left] == chars[right]){
                left--;
                right++;
                result++;
            }
        }
        return result;
    }
}
