package solution;

import java.util.Arrays;

/**
 * @author ：Tong
 * @date ：Created in 2020/5/21 10:54
 * @description：
 * @version: $
 */
public class HammingWeight {
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            res += n & 1;
            n >>>= 1;
        }
        int[] nums = new int[5];
        Arrays.();
        return res;
    }
}
