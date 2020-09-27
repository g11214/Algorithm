package solution;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/13 16:19
 * @description： 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * <p>
 * 注意：
 * 0 ≤ x, y < 231.
 * <p>
 * 示例:
 * 输入: x = 1, y = 4
 * 输出: 2
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ↑   ↑
 * 上面的箭头指出了对应二进制位不同的位置。
 * @version: $
 */
public class Top_461HammingDistance {
    public int solution(int x, int y) {
        String strX = Integer.toBinaryString(x);
        String strY = Integer.toBinaryString(y);
        System.out.println(strX);
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (strX.charAt(i)!= strY.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
