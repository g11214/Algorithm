package Hot100;

/**
 * @description:
 * @author: Tong
 * @date: 2020-03-30 19:56
 */
public class Top_4findMedianSortedArrays {
    public double solution(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int midIndex = (len1 + len2) / 2;

        int index1 = 0;
        int index2 = 0;
        int[] res = new int[len1 + len2];

        int i = 0;
        for (; i <= midIndex; i++) {
            int currNum;
            if (index1 >= len1) {//数组1结束
                currNum = nums2[index2];
                index2++;
            } else if (index2 >= len2) {//数组2结束
                currNum = nums1[index1];
                index1++;
            } else {//都未结束
                if (nums1[index1] < nums2[index2]) {
                    currNum = nums1[index1];
                    index1++;
                } else {
                    currNum = nums2[index2];
                    index2++;
                }
            }

            res[i] = currNum;
        }
        if ((len1 + len2) % 2 == 0) {
            return (res[i-1] + res[i - 2]) / 2.0;
        } else {
            return res[i-1] / 1.0;
        }
    }
}
