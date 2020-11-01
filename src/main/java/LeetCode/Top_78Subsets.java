package LeetCode;


import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/16 17:11
 * @description： 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * <p>
 * 说明：解集不能包含重复的子集。
 * <p>
 * 示例:
 * <p>
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 * [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 * @version: $
 */
public class Top_78Subsets {
    public static List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> allList = new ArrayList<>();
        List<Integer> nullList = new ArrayList<>();
        allList.add(nullList);
        int len = nums.length;
        int currCount = allList.size();
        int nextCount = currCount;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < currCount; j++) {
                List<Integer> nextList = new ArrayList<>(allList.get(j));
                nextList.add(nums[i]);
                allList.add(nextList);
                nextCount++;
            }
            currCount = nextCount;
        }

        return allList;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        solution(nums);
    }
}
