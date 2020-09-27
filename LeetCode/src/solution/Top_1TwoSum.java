package solution;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author ：Tong
 * @date ：Created in 2020/3/30 15:58
 * @description： 给定一个整数数组 nums和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * @version: $
 */
public class Top_1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];

        // 建立k-v ，一一对应的哈希表
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                indexs[0] = i;
                indexs[1] = map.get(target - nums[i]);
                return indexs;
            }
            // 将数据存入 key为补数 ，value为下标
            map.put(nums[i],i);
        }
        return indexs;
    }
}
