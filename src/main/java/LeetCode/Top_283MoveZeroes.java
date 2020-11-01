package LeetCode;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/13 17:37
 * @description： 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * <p>
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * @version: $
 */
public class Top_283MoveZeroes {
    public void solution(int[] nums) {
        int len = nums.length;
        int noZeroIndex = 1;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                noZeroIndex = Math.max(noZeroIndex, i + 1);
                for (int j = noZeroIndex; j < len; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        noZeroIndex = j + 1;
                        break;
                    }
                }
            }
        }
    }
}
