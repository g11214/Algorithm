package solution;

import java.util.Arrays;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/15 12:12
 * @description： 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * <p>
 * 你找到的子数组应是最短的，请输出它的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2, 6, 4, 8, 10, 9, 15]
 * 输出: 5
 * 解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
 * @version: $
 */
public class Top_581FindUnsortedSubarray {
    public static int solution(int[] nums) {
        int[] resNums = Arrays.copyOf(nums,nums.length);
        Arrays.sort(resNums);
        int start = 0, end = nums.length - 1;
        for (; start < nums.length; start++) {
            if (nums[start] == resNums[start]) {
                continue;
            } else {
                break;
            }
        }
        for (; end >= 0; end--) {
            if (nums[end] == resNums[end]) {
                continue;
            } else {
                break;
            }
        }
        if (start > end) {
            return 0;
        }
        return end - start + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,6,4,8,10,9,15};
        System.out.println(solution(nums));

    }
}
