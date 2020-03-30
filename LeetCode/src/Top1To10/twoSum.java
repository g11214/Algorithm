package Top1To10;

/**
 * @author ：Tong
 * @date ：Created in 2020/3/30 15:58
 * @description： 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * @version: $
 */
public class twoSum {
    public int[] solution(int[] nums, int target) {
        int[] result = new int[2];
        int len = nums.length;
        out: for (int i = 0; i < len; i++) {
            int currNum = nums[i];
            for (int j = i + 1; j < len; j++) {
                if (currNum + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break out;
                }
            }
        }
        return result;
    }
}
