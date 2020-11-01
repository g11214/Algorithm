package LeetCode;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/3 16:06
 * @description： 给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字）。
 * @version: $
 */
public class Top_152MaxProduct {
    public int solution(int[] nums) {
        int len = nums.length;

        int max = 1;
        int min = 1;

        int resMax = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max *= nums[i];
            min *= nums[i];
            resMax = Math.max(resMax, max);
        }
        return max;
    }
}
