package solution;

/**
 * @author ：Tong
 * @date ：Created in 2020/5/9 15:43
 * @description：
 * @version: $
 */
public class Top_11MaxArea {
    public int maxArea(int[] height) {
        int len = height.length;

        int leftIndex = 0;
        int rightIndex = len - 1;

        int maxNum = 0;
        while(leftIndex < rightIndex){
            if(height[leftIndex] < height[rightIndex]){
                maxNum = Math.max((rightIndex - leftIndex) * height[leftIndex], maxNum);
                leftIndex++;
            } else{
                maxNum = Math.max((rightIndex - leftIndex) * height[rightIndex] , maxNum);
                rightIndex--;
            }

        }
        return maxNum;
    }
}
