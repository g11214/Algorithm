package LeetCode;

/**
 * @author ：Tong
 * @date ：Created in 2020/3/31 14:53
 * @description：
 * @version: $
 */
public class Top_6Convert {
    public String solution(String s, int numRows) {
        int len = s.length();
        char[][] strArr = new char[numRows][len / 2];

        int row = 0;
        int col = 0;
        for (int i = 0; i < len; i++) {
            if (col % 2 == 0) {//偶数位Z型
                if (row == 0) {
                    row = numRows - 1;
                }
                if (row == 1) {
                    col++;
                    row = 0;
                }
                strArr[row][col] = s.charAt(i);
                row--;
            } else {
                strArr[row][col] = s.charAt(i);
                row++;
                if (row == numRows) {
                    col++;
                    row = 0;
                }
            }
        }

        return "temp";
    }
}
