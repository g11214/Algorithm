package LeetCode;

/**
 * @description:
 * @author: Tong
 * @date: 2020-04-18 21:43
 */
public class Top_338CountBits {
    public int[] solution(int num) {
        int[] res = new int[num + 1];
        for (int i = 1; i <= num; i++) {  //注意要从1开始，0不满足
            res[i] = res[i & (i - 1)] + 1;
        }
        return res;
    }

    public int[] solution2(int num) {
        int[] res = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            res[i] = res[i >> 1] + (i & 1);  //注意i&1需要加括号
        }
        return res;
    }
}
