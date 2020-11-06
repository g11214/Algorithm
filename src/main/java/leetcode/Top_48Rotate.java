package leetcode;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/20 15:19
 * @description：
 * @version: $
 */
public class Top_48Rotate {
    public static void solution(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len / 2; i++) {//圈
            for (int j = i; j < len - i - 1; j++) {//每一圈遍历圈减一位
                int tempVal = matrix[i][j];
                matrix[i][j] = matrix[len - j - 1][i];
                matrix[len - j - 1][i] = matrix[len - i - 1][len - j - 1];
                matrix[len - i - 1][len - j - 1] = matrix[j][len - i - 1];
                matrix[j][len - i - 1] = tempVal;
            }
        }
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{
                {5, 1, 9, 11, 1},
                {2, 4, 8, 10, 2},
                {13, 3, 6, 7, 3},
                {15, 14, 12, 16, 6},
                {3, 6, 5, 4, 6}
        };
        solution(nums);
    }
}
