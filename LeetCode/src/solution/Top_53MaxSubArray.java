package solution;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/15 15:37
 * @description： 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * @version: $
 */
public class Top_53MaxSubArray {
    public int solution(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        //dp：当前连续子序列的和
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < len; i++) {
            //前一个序列和小于0，舍弃，新的值最为新序列
            if (dp[i - 1] > 0) {
                dp[i] = dp[i - 1] + nums[i];
            }else{
                dp[i] = Math.max(nums[i], dp[i - 1]);
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
