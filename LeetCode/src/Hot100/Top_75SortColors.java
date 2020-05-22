package Hot100;

/**
 * @author ：Tong
 * @date ：Created in 2020/5/13 12:07
 * @description：
 * @version: $
 */
public class Top_75SortColors {
    public void sortColors(int[] nums) {
        int oneBorder = 0;
        int twoBorder = nums.length - 1;
        for(int i = 0; i<= twoBorder; i++){
            if(nums[i] == 0){
                swap(nums, i, oneBorder);
                oneBorder++;
            } else if (nums[i] == 2){
                swap(nums, i, twoBorder);
                twoBorder--;
                i--;
            }
        }
    }
    public void swap(int[] nums , int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
