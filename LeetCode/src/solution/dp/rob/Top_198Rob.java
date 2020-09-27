package solution.dp.rob;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/14 16:27
 * @description： 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * <p>
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 * 示例 2:
 * <p>
 * 输入: [2,7,9,3,1]
 * 输出: 12
 * 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 * @version: $
 */
public class Top_198Rob {
    public int solution(int[] nums) {
        int len = nums.length;

        if (len <= 0) {
            return 0;
        }else if (len == 1) {
            return nums[0];
        }else if (len == 2) {
            return Math.max(nums[0], nums[1]);
        }else{
            int[] dp = new int[len];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
            for(int i = 2; i < len; i++){
                dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
            }
            return dp[len-1];
        }
    }
}
