package swordtooffer;

/**
 * @author ：Tong
 * @date ：Created in 2019/9/6 14:44
 * @description：在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。 输入一个数组, 求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 * @version: $
 */
public class InversePairs {
    public int inversePairs(int[] array) {
        int len = array.length;
        int pairsNum = 0;
        for (int i = 0; i < len; i++) {
            int tempVal = array[i];
            for (int j = i + 1; j < len; j++) {
                if (tempVal > array[j]) {
                    pairsNum++;
                }
            }
        }
        return pairsNum % 1000000007;
    }

    public int inversePairsBetter(int[] array) {
        return 0;
    }
}
