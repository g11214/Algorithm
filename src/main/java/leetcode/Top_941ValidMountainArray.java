package leetcode;

public class Top_941ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        if (A == null || A.length < 3){
            return false;
        }
        int len = A.length;
        //先找到顶点
        int i = 0;
        for (i = 1; i < len; i++) {
            if(A[i] == A[i - 1]){
                return false;
            }else if(A[i] < A[i - 1]){
                break;
            }
        }
        if (i == len || i == 1)
            return false;
        //i-1为顶点
        for (int j = i; j < len; j++) {
            if(A[j] == A[j - 1]){
                return false;
            }else if(A[j] > A[j - 1]){
                return false;
            }
        }
        return true;
    }
}
