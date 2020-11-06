package leetcode;

import java.util.Arrays;

/**
 * @author ：Tong
 * @date ：Created in 2020/3/31 10:46
 * @description： 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 * @version: $
 */
public class Top_5LongestPalindrome {
    /*
     * @description: dp
     * @param:  s
     * @return: java.lang.String
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int len = s.length();
        boolean[][] dp = new boolean[len + 1][len + 1];

        int maxLen = 1;
        int start = 1, end = 1;

        for (int i = 1; i <= len; i++) {
            dp[i][i] = true;
            for (int j = 1; j <= len; j++) {
                if (j < i) {
                    dp[i][j] = true;
                }
            }
        }

        for (int i = len - 1; i >= 1; i--) {
            for (int j = i + 1; j <= len; j++) {
                //从i到j,是否为回文
                dp[i][j] = dp[i + 1][j - 1] && s.charAt(i - 1) == s.charAt(j - 1);
                //dp[i][j]是回文，计算是否当前最大
                if (dp[i][j] && (j - i + 1) > maxLen) {
                    maxLen = j - i + 1;
                    start = i;
                    end = j;
                }
            }
        }
        return s.substring(start - 1, end);
    }

    /**
     * @description: 中心扩展法
     * @param: s
     * @return: java.lang.String
     */
    public String longestPalindrome2(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            Arrays.fill(dp[i], false);
        }

        // 初始化
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }


        char[] charArray = s.toCharArray();
        int maxLen = 1;
        int start = 0;

        for (int j = 1; j < len; j++) {
            // 只有下面这一行和「参考代码 2」不同，i 正着写、倒过来写都行，因为子串都有参考值
            for (int i = j - 1; i >= 0; i--) {

                if (charArray[i] == charArray[j]) {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                } else {
                    dp[i][j] = false;
                }

                // 只要 dp[i][j] == true 成立，就表示子串 s[i, j] 是回文，此时记录回文长度和起始位置
                if (dp[i][j]) {
                    int curLen = j - i + 1;
                    if (curLen > maxLen) {
                        maxLen = curLen;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}
