package common;

/**
 * @description: 公共方法类
 * @author: Tong
 * @date: 2019-07-27 10:03
 */
public class Util {
    /**
     * 交换数组中的值
     *
     * @param a 数组
     * @param i 交换的下标
     * @param j 交换的下标
     */
    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * 打印数组,格式化输出
     *
     * @param a 数组
     * @param n 每行个数
     */
    public void print(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%-3d", a[i]);
            //System.out.format("%-3d",a[i]);

            if ((i + 1) % n == 0) {
                System.out.println();
            }
        }
    }
}
