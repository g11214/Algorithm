package leetcode;

/**
 * @description: 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * <p>
 * 说明：每次只能向下或者向右移动一步。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [
 *   [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 * @author: Tong
 * @date: 2020-04-20 21:02
 */
public class Top_64MinPathSum {
    public int solution(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                } else {
                    if (i == 0) {
                        dp[i][j] = grid[i][j] + dp[i][j - 1];
                    } else if (j == 0) {
                        dp[i][j] = grid[i][j] + dp[i - 1][j];
                    } else {
                        dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }
}
